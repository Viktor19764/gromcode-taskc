package lesson5.HW;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();


        //if array is empty
        //overflow
        System.out.println(Arrays.toString(bubbleSort.sortAscending(new int[]{})));;
        System.out.println(Arrays.toString(bubbleSort.sortAscending(new int[]{0, Integer.MAX_VALUE, Integer.MAX_VALUE-1})));;

        //if array is empty
        //overflow
        System.out.println(Arrays.toString(bubbleSort.sortDescending(new int[]{})));;
        System.out.println(Arrays.toString(bubbleSort.sortDescending(new int[]{0, Integer.MAX_VALUE, Integer.MAX_VALUE-1})));;

        UniqueCountClass uniqueCountClass = new UniqueCountClass();

        //if array is empty
        //overflow
        System.out.println(uniqueCountClass.uniqueCount(new int[]{}));;
        System.out.println(uniqueCountClass.uniqueCount(new int[]{0, Integer.MAX_VALUE, Integer.MAX_VALUE-1}));

        WithdrawMoney withdrawMoney = new WithdrawMoney();
        withdrawMoney.names = new String[]{"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John"};
        withdrawMoney.balances = new int[]{50, 500, 8432, -99, -2147483648, 40, 0};

        //if balance is good
        //if balance is <0
        //if balance == 0
        //if balance is < amount
        //if balance == amount
        withdrawMoney.withdraw(withdrawMoney.names, withdrawMoney.balances, "Denis", 50);
        System.out.println(Arrays.toString(withdrawMoney.balances));
        withdrawMoney.withdraw(withdrawMoney.names, withdrawMoney.balances, "Andrey", 50);
        System.out.println(Arrays.toString(withdrawMoney.balances));
        withdrawMoney.withdraw(withdrawMoney.names, withdrawMoney.balances, "John", 50);
        System.out.println(Arrays.toString(withdrawMoney.balances));
        withdrawMoney.withdraw(withdrawMoney.names, withdrawMoney.balances, "Irina", 50);
        System.out.println(Arrays.toString(withdrawMoney.balances));
        withdrawMoney.withdraw(withdrawMoney.names, withdrawMoney.balances, "Jack", 50);
        System.out.println(Arrays.toString(withdrawMoney.balances));

    }
}
