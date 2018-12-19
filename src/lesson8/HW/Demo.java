package lesson8.HW;

public class Demo {
    public static void main(String[] args) {

        int[] array = {2147483646, 20, 30, 40, 50, 60, 70, 80, 2147483647};
        //int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 100};
        int a = 2147483647;
        int b = 2147483647;

        Adder adder = new Adder();
        System.out.println(adder.check(array));
        System.out.println(adder.add(a, b));
    }
}
