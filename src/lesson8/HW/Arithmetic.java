package lesson8.HW;

public class Arithmetic {
    boolean check(int[] array) {


        int min = array[0];
        for (int el : array) {
            if (el < min)
                min = el;
        }

        int max = array[0];
        for (int el : array) {
            if (el > min)
                max = el;
        }


        return ((long) min + (long) max) > 100;
    }
}
