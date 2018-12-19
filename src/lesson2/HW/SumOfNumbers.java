package lesson2.HW;

import java.math.BigInteger;

public class SumOfNumbers {
    
  public static void main (String [] args){
    BigInteger a = new BigInteger("0");
    BigInteger b = new BigInteger("10000000");
    BigInteger two = new BigInteger("2");
    BigInteger tenMillionsOne = new BigInteger("10000001");
   
     BigInteger sum = ((a.add(b)).divide(two)).multiply(tenMillionsOne);
       System.out.println(sum);  
  }  
}