import java.util.Arrays;
import java.util.Scanner;

public class LabExperiment6Ques4 {
    public static void Logic(int[] arr,int x,int y,int z){
        int[] array2=new int[y-z];
        int Index=0;
        for(int i=0;i<y;i++){
                       if(arr[i]!=x){
                array2[Index]=arr[i];
         }
           Index++;
        }
        System.out.println("after deleting the element :- "+(Arrays.toString(array2)));
    }



    public static void main(String[] args) {
    //Write a Java program to delete an element from 1D Array
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the ammount of terms you want in array");
    int terms= sc.nextInt();
    int[] array1=new int[terms];
    for(int i=0;i<terms;i++) {
        System.out.println("Enter the array["+i+"] element :-");
        array1[i]=sc.nextInt();
    }
    int count=0;
        System.out.println("Enter the element you wat to delete: -");
        int choice=sc.nextInt();
        for(int i=0; i<terms;i++){
            if(array1[i]==choice){
                count++; 
            }
        }if(count==0){
            System.out.println("Entered Number is not in the array.");
        }else{
        Logic(array1,choice,terms,count);
    }
}
}