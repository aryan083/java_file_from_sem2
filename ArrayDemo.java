import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the 10 Entries for Array.");
    
    int arr[]= new int[10];
    for (int i =0;i<=9;i++){
    arr[i]= sc.nextInt();
    }
    for (int i =0;i<=9;i++){
       System.out.println(arr[i]);;
        }
    sc.close();
}}
