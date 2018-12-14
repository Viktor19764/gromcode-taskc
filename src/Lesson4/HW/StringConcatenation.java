package Lesson4.HW;

public class StringConcatenation {

    static String concat(String a, String b, String c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(concat("First ", "Second ", "Third"));
    }
}
