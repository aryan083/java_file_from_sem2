import java.util.Scanner;

public class LabExperiment6Ques3 {
    //Write a Java program to insert an element in 1D Array.
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
