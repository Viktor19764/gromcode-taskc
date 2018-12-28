package lesson12;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Bank euBank = new EUBank(1222, "Sweden", Currency.EUR, 100, 1400, 4, 444343434);
        Bank chinaBank = new ChinaBank(3222, "China", Currency.EUR, 200, 700, 8, 1744343434);
        Bank usBank = new USBank(477, "USA", Currency.USD, 70, 5000, 3, 1944343434);

        User user1 = new User(1001, "Denis", 12200, 40, "GMD", 1500, euBank);

        User user2 = new User(1003, "Wey", 4200, 60, "ENO", 700, chinaBank);

        User user3 = new User(1005, "John", 42000, 36, "TMK", 5700, usBank);
        User user4 = new User(1007, "John", 10000, 36, "TMK", 5800, usBank);

        BankSystem bankSystem = new UkrainianBankSystem();


        System.out.println("Start testing EUBank");
        System.out.println("testing withdraw");
        //withdraw
        System.out.println("withdraw EuBank, before " + user1.getBalance());
        bankSystem.withdraw(user1, 100);
        System.out.println("withdraw EuBank, after  " + user1.getBalance());
        //withdraw too large amount
        System.out.println("withdraw to large EuBank, before " + user1.getBalance());
        bankSystem.withdraw(user1, Integer.MAX_VALUE);
        System.out.println("withdraw to large EuBank, after  " + user1.getBalance());
        //withdraw negative amount
        System.out.println("withdraw <0 EuBank, before " + user1.getBalance());
        bankSystem.withdraw(user1, Integer.MIN_VALUE);
        System.out.println("withdraw <0 EuBank, after  " + user1.getBalance());
        //withdraw 0
        System.out.println("withdraw 0 EuBank, before " + user1.getBalance());
        bankSystem.withdraw(user1, 0);
        System.out.println("withdraw 0 EuBank, after  " + user1.getBalance());
        System.out.println("--------------------------------------");

        System.out.println("Start testing ChinaBank");
        System.out.println("testing withdraw");
        //withdraw
        System.out.println("withdraw ChinaBank, before " + user2.getBalance());
        bankSystem.withdraw(user2, 50);
        System.out.println("withdraw ChinaBank, after  " + user1.getBalance());
        //withdraw too large amount
        System.out.println("withdraw to large ChinaBank, before " + user2.getBalance());
        bankSystem.withdraw(user2, Integer.MAX_VALUE);
        System.out.println("withdraw to large ChinaBank, after  " + user2.getBalance());
        //withdraw negative amount
        System.out.println("withdraw <0 ChinaBank, before " + user2.getBalance());
        bankSystem.withdraw(user2, Integer.MIN_VALUE);
        System.out.println("withdraw <0 ChinaBank, after  " + user2.getBalance());
        //withdraw 0
        System.out.println("withdraw 0 ChinaBank, before " + user2.getBalance());
        bankSystem.withdraw(user2, 0);
        System.out.println("withdraw 0 ChinaBank, after  " + user2.getBalance());
        System.out.println("--------------------------------------");

        System.out.println("Start testing USBank");
        System.out.println("testing withdraw");
        //withdraw
        System.out.println("withdraw USBank, before " + user3.getBalance());
        bankSystem.withdraw(user3, 50);
        System.out.println("withdraw USBank, after  " + user3.getBalance());
        //withdraw too large amount
        System.out.println("withdraw to large USBank, before " + user3.getBalance());
        bankSystem.withdraw(user3, Integer.MAX_VALUE);
        System.out.println("withdraw to large USBank, after  " + user3.getBalance());
        //withdraw negative amount
        System.out.println("withdraw <0 USBank, before " + user3.getBalance());
        bankSystem.withdraw(user3, Integer.MIN_VALUE);
        System.out.println("withdraw <0 USBank, after  " + user3.getBalance());
        //withdraw 0
        System.out.println("withdraw 0 USBank, before " + user3.getBalance());
        bankSystem.withdraw(user3, 0);
        System.out.println("withdraw 0 USBank, after  " + user3.getBalance());

        //////////////////////////////////////////////////
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");

        System.out.println("Start testing EUBank");
        System.out.println("testing fund");
        //fund
        System.out.println("fund EuBank, before " + user1.getBalance());
        bankSystem.fund(user1, 100);
        System.out.println("fund EuBank, after  " + user1.getBalance());
        //fund too large amount
        System.out.println("fund to large EuBank, before " + user1.getBalance());
        bankSystem.fund(user1, Integer.MAX_VALUE);
        System.out.println("fund to large EuBank, after  " + user1.getBalance());
        //fund negative amount
        System.out.println("fund <0 EuBank, before " + user1.getBalance());
        bankSystem.fund(user1, Integer.MIN_VALUE);
        System.out.println("fund <0 EuBank, after  " + user1.getBalance());
        //withdraw 0
        System.out.println("fund 0 EuBank, before " + user1.getBalance());
        bankSystem.fund(user1, 0);
        System.out.println("fund 0 EuBank, after  " + user1.getBalance());
        System.out.println("--------------------------------------");

        System.out.println("Start testing ChinaBank");
        System.out.println("testing fund");
        //withdraw
        System.out.println("fund ChinaBank, before " + user2.getBalance());
        bankSystem.withdraw(user2, 50);
        System.out.println("fund ChinaBank, after  " + user2.getBalance());
        //withdraw too large amount
        System.out.println("fundw to large ChinaBank, before " + user2.getBalance());
        bankSystem.fund(user2, Integer.MAX_VALUE);
        System.out.println("fund to large ChinaBank, after  " + user2.getBalance());
        //withdraw negative amount
        System.out.println("fund <0 ChinaBank, before " + user2.getBalance());
        bankSystem.fund(user2, Integer.MIN_VALUE);
        System.out.println("fund <0 ChinaBank, after  " + user2.getBalance());
        //withdraw 0
        System.out.println("fund 0 ChinaBank, before " + user2.getBalance());
        bankSystem.fund(user2, 0);
        System.out.println("fund 0 ChinaBank, after  " + user2.getBalance());
        System.out.println("--------------------------------------");

        System.out.println("Start testing USBank");
        System.out.println("testing fund");
        //withdraw
        System.out.println("fund USBank, before " + user3.getBalance());
        bankSystem.fund(user3, 50);
        System.out.println("fund USBank, after  " + user3.getBalance());
        //withdraw too large amount
        System.out.println("fund to large USBank, before " + user3.getBalance());
        bankSystem.fund(user3, Integer.MAX_VALUE);
        System.out.println("fund to large USBank, after  " + user3.getBalance());
        //withdraw negative amount
        System.out.println("fund <0 USBank, before " + user3.getBalance());
        bankSystem.fund(user3, Integer.MIN_VALUE);
        System.out.println("fund <0 USBank, after  " + user3.getBalance());
        //withdraw 0
        System.out.println("fund 0 USBank, before " + user3.getBalance());
        bankSystem.fund(user3, 0);
        System.out.println("fund 0 USBank, after  " + user3.getBalance());
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");

        System.out.println("Start testing  paySalary");
        System.out.println("testing paySalary");
        //withdraw
        System.out.println("paySalary USBank, before " + user3.getBalance());
        bankSystem.paySalary(user3);
        System.out.println("paySalary USBank, after  " + user3.getBalance());
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");

        System.out.println("Start testing transferMoney USBank-USBank");
        System.out.println("transferMoney USBank-ChinaBank, before, user3 " + user3.getBalance());
        System.out.println("transferMoney USBank-ChinaBank, before, user4 " + user4.getBalance());
        bankSystem.transferMoney(user3, user4, 50);
        System.out.println("transferMoney USBank-ChinaBank, after, user3 " + user3.getBalance());
        System.out.println("transferMoney USBank-ChinaBank, after, user4 " + user4.getBalance());

    }
}
