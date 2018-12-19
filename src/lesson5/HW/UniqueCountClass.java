package lesson5.HW;

import java.util.Arrays;

public class UniqueCountClass {
    public static void main(String[] args) {
        int[] array = {11, 12, 10, 5, 4, 44, 100, 44, 11, 10, 11};
        System.out.println(uniqueCount(array));
        System.out.println(Arrays.toString(sortAscending(array)));

    }

    public static int uniqueCount(int[] array){
        sortAscending(array);
        int count = 1;


        for (int j = 1; j < array.length; j++) {
           if (array[j] != array[j-1])
               count++;
        }
        return  count;

    }


    public static int[] sortAscending(int[] array) {

        boolean action;
        int bubble = 0;

        do {
            action = false;
            for (int i = 0; i <= array.length - 2; i++) {
                if (array[i] > array[i + 1]) {
                    bubble = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = bubble;
                    action = true;
                }
            }
        }
        while (action);
        return array;

    }
}

