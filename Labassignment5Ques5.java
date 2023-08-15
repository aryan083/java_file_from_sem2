import java.util.Scanner;

//Write a Java program to implement 1D Array.

public class Labassignment5Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ammont of terms to add in array.");
        int terms =sc.nextInt();
        int[] array = new int [terms];
        for (int i = 0 ;i<terms;i++){
            array[i]=sc.nextInt();
}
for (int i= 0;i<terms;i++){
    System.out.println("array "+"["+i+"]"+ " = " + array[i]);
}
       sc.close();


    }
}
