package Lesson5;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {

        int[] array ={1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        System.out.println(sortAscending(array));

    }
    public static int sortAscending(int[] array) {
        int sort = array [0];

        Arrays.sort(array);
        for(int i = 0; i <  array.length; i++) {
            System.out.print(array[i] + " ");

        }
        return sort;
    }

    /*static int[] array sortDescending(int[] array) {

    }*/

}
