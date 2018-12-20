package lesson12;

public class UkrainianBankSystem implements BankSystem {

    @Override
    public void withdraw(User user, int amount) {

        if (!checkWithdraw(user, amount)) {
            printWithdrawalErrorMsg(amount, user);
            return;
        }

        user.setBalance(user.getBalance() - amount - amount * user.getBank().getCommission(amount));
    }

    @Override
    public void fund(User user, int amount) {
        if (!checkFunding(user, amount))
            return;
        user.setBalance(user.getBalance() + amount);
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        if (!checkWithdraw(fromUser, amount))
            return;
        if (!checkFunding(toUser, amount))
            return;
        if (fromUser.getBank().getCurrency() == toUser.getBank().getCurrency()) {
            withdraw(fromUser, amount);
            fund(toUser, amount);
        }
    }

    @Override
    public void paySalary(User user) {
        if(!checkFunding(user, user.getSalary()))
            return;
        fund(user, user.getSalary());
    }

    private void printWithdrawalErrorMsg(int amount, User user) {
        System.err.println("Can't withdraw money " + amount + " from user " + user.toString());
    }

    private boolean checkWithdraw(User user, int amount) {
        return checkWithdrawLimits(user, amount, user.getBank().getLimitOfWithdrawal()) && checkWithdrawLimits(user, amount, user.getBalance());
    }

    private boolean checkWithdrawLimits(User user, int amount, double limit) {
        if (amount + amount * user.getBank().getCommission(amount) > limit) {
            return false;
        }
        return true;
    }

    private boolean checkFunding(User user, int amount) {
        return user.getBank().getLimitOfFunding() >= amount ? true: false;
    }

}