package lesson14;

public class Demo {
    public static void main(String[] args) {
        Object oojectTest = new Object();

        System.out.println(oojectTest.toString());
        System.out.println(oojectTest.getClass().getName());

        oojectTest = new Object();

        System.out.println(oojectTest.toString());
        System.out.println(oojectTest.getClass().getName());

        oojectTest = new Object();

        System.out.println(oojectTest.toString());
        System.out.println(oojectTest.getClass().getName());

    }
}
