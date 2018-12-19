package lesson12;

public class Main {
    public static void main(String[] args) {
        Bank euBank = new EUBank(1222, "Sweden", Currency.EUR, 100, 1400, 4, 444343434);
        Bank chinaBank = new ChinaBank(3222, "China", Currency.EUR, 200, 700, 8, 1744343434);
        Bank usBank = new USBank(477, "USA", Currency.USD, 70, 5000, 3, 1944343434);

        User user1 = new User(1001, "Denis", 12200, 40, "GMD", 1500, euBank);
        User user2 = new User(1002, "Dmytro", 10000, 20, "GMD", 1450, euBank);

        User user3 = new User(1003, "Wey", 4200, 60, "ENO", 700, chinaBank);
        User user4 = new User(1004, "Li", 2000, 20, "ENO", 750, chinaBank);

        User user5 = new User(1005, "John", 42000, 36, "TMK", 5700, usBank);
        User user6 = new User(1006, "Kate", 20000, 20, "EKOLIFE", 3750, usBank);

        User[] users = {user1, user2, user3, user4, user5, user6};

        BankSystem bankSystem = new UkrainianBankSystem();

        int i = 0;
        for (User user : users) {
            System.out.println(user.getBalance());
            bankSystem.withdraw(user, 100);
            System.out.println(user.getBalance());
            bankSystem.fund(user, 150);
            System.out.println(user.getBalance());
            bankSystem.paySalary(user);
            System.out.println(user.getBalance());
            i++;
            if (i <= users.length - 1)
                bankSystem.transferMoney(users[i - 1], users[i], 200);
            System.out.println(user.getBalance());
        }

    }
}
