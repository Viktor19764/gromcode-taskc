package lesson5.HW;

import lesson4.HW.StringConcatenation;

import java.util.Arrays;

public class WithdrawMoney {
    String[] names;
    int[] balances = {100, 500, 8432, -99, -2147483648, -54, 0};

    public static void main(String[] args) {

        String[] names = {"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John"};
        int[] balances = {100, 500, 8432, -99, -2147483648, -54, 0};
        //System.out.println(Arrays.toString(findClientsByBalance(names, balances, -100)));
        withdraw(names, balances, "Nikolay", 100);
        System.out.println(Arrays.toString(balances));

    }

    static int withdraw(String[] clients, int[] balances, String client, int amount) {
        int index = 0;
        
        for (String currentClient : clients) {
            if (currentClient == client) {
                long result = (long) balances[index] - (long) amount;
                if (result >= 0) {
                    balances[index] = (int) result;
                    return (int) result;

                }


            }
            index++;
        }
        return -1;

    }


}
