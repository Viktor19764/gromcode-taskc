package Lesson4.HW;

public class DivCount {
    static int findDivCount (short a, short b, int n){
        int count = 0;
        if (n > 0 && 0 <= a && a <= b){

                for (int i = a; i <= b; i++){
                    if (i % n == 0)
                        count++;
                }


        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findDivCount((short) 33000, (short) 20, 3));
    }
}
