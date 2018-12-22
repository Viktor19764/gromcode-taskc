package lesson4.HW;

public class Demo {
    public static void main(String[] args) {
        CompareSum compareSum = new CompareSum();

        //sum()
        //overflow checking
        //comparison of negative and positive amounts

        System.out.println(compareSum.sum(10, Integer.MAX_VALUE));
        System.out.println(compareSum.sum(Integer.MIN_VALUE+1, 0));
        System.out.println(" " + compareSum.sum(0, Integer.MAX_VALUE));

        //compareSum.compareSums()
        //(a+b)>(c+d)
        //(a+b)<(c+d)
        //(a+b)==(c+d)
        System.out.println(compareSum.compareSums(0, Integer.MAX_VALUE , 0, Integer.MIN_VALUE));
        System.out.println(compareSum.compareSums(0, Integer.MIN_VALUE , 0, Integer.MAX_VALUE));
        System.out.println(compareSum.compareSums(0, Integer.MAX_VALUE , 0, Integer.MAX_VALUE));


        //divCount.findDivCount
        //n<0
        //n MAX
        //a==b
        DivCount divCount = new DivCount();
        System.out.println(divCount.findDivCount((short) 0, Short.MAX_VALUE, -1));
        System.out.println(divCount.findDivCount((short) 0, Short.MAX_VALUE, 1));
        System.out.println(divCount.findDivCount((short) 0, Short.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println(divCount.findDivCount((short) 0, Short.MAX_VALUE, Short.MAX_VALUE));

        //three strings are presented
        //one string is absent
        StringConcatenation stringConcatenation = new StringConcatenation();
        System.out.println(stringConcatenation.concat("a","b","c"));
        System.out.println(stringConcatenation.concat(null,"b","c"));

    }
}
