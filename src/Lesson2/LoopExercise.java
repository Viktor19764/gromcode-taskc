package Lesson2;

public class LoopExercise {
  public static void main (String [] args){
   for (int i = 1; i <= 20; i++){
     if ((i >= 5 && i <= 10) || (i >= 15 && i <= 20) )
       System.out.println(i);
   }
  }  
}