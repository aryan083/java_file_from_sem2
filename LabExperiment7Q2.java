//Write a Java Program to demonstrate Exception Handling using try, catch and finally.

import java.util.*;

public class LabExperiment7Q2 {
    public static void main(String[] args) {
      try{
        int[] ar1 = new int[5];
        Scanner sc =new Scanner(System.in);
       System.out.println("Enter the term you want to change");
       int num=sc.nextInt(); 
       ar1[num]= sc.nextInt();
      }
      catch(Exception ex){
         System.out.println(ex.getMessage());
      }
      finally{
    System.out.println("Complete");
}
    }
    
}
