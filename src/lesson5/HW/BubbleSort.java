package lesson5.HW;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {2, 5, 9, 7, 4, 11, 3};
        sortAscending(array);
        System.out.println(Arrays.toString(array));
        sortDescending(array);
        System.out.println(Arrays.toString(array));


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

    public static int[] sortDescending(int[] array) {

        boolean action;
        int bubble = 0;

        do {
            action = false;
            for (int i = 0; i <= array.length - 2; i++) {
                if (array[i] < array[i + 1]) {
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
