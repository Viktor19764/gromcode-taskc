package lesson1;

import lesson9.utils.Checker;

public class FirstProgram {
  public static void main (String [] args){
   System.out.println("My first Java program"); 
   System.out.println("I like it");
      Checker checker = new Checker();
      System.out.println(checker.checkCompanyName("Google"));
  }  
}