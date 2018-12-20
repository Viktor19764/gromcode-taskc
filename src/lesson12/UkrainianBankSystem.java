package lesson12;

public class UkrainianBankSystem implements BankSystem {

    @Override
    public void withdraw(User user, int amount) {
        //перевірити чи можна зняти
        // перевірити ліміт
        // перевірити чи досить грошей
        //зняти гроші

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
        //знімаємо гроші з fromUser
        //поповнюємо toUser
        if (!checkWithdraw(fromUser, amount))
            return;
        if (!checkFunding(toUser, amount))
            return;
        if (fromUser.getBank().getCurrency() == toUser.getBank().getCurrency()) {
            withdraw(fromUser, amount);
            //if (!checkWithdraw(fromUser, amount))
            //return;

            //fromUser.setBalance(fromUser.getBalance() - amount - amount * fromUser.getBank().getCommission(amount));

            fund(toUser, amount);
        } else
            System.out.println("Transfer error");
    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalary());
    }

    private void printWithdrawalErrorMsg(int amount, User user) {
        System.err.println("Can't withdraw money " + amount + " from user " + user.toString());
    }

    private boolean checkWithdraw(User user, int amount) {
        return checkTransferLimits(user, amount, user.getBank().getLimitOfWithdrawal()) && checkTransferLimits(user, amount, user.getBalance());
    }

    private boolean checkTransferLimits(User user, int amount, double limit) {
        if (amount + amount * user.getBank().getCommission(amount) > limit) {
            return false;
        }
        return true;
    }

    private boolean checkFunding(User user, int amount) {
        return checkTransferLimits(user, amount, user.getBank().getLimitOfFunding());
    }

}
