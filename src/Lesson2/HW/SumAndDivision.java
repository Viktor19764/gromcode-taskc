package Lesson2.HW;

public class SumAndDivision {
    
  public static void main (String [] args){
     int sum = (1+1000)*1000/2;
       int whole = sum / 1234;
       int remainder = sum % 1234;
       int check = whole / remainder;
       String answer = (check > 0)? "false": "true";
       System.out.println(answer);
  }  
}