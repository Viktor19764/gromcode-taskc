package lesson4.HW;

public class CompareSum {

    public CompareSum() {
    }

    public static long sum (int from, int to){
        long sum = 0;
        for (long i = from; i <= to; i++)
            sum += i;
        return sum;
    }

    static boolean compareSums (int a, int b, int c, int d){
        return (sum(a, b) > sum(c, d));

    }



//    public static void main(String[] args) {
//        System.out.println(compareSums(2,100, 3, 101));
//
//    }
}
