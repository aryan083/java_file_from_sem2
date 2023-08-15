import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the terms for array");
        int terms= sc.nextInt();
        int[] array1= new  int[terms];
        for(int i=0;i<terms;i++){
            array1[i]=sc.nextInt();
        }   int count=0;

        System.out.println("Enter the number you want to find in array");
        int find_it=sc.nextInt();
        for(int i= 0;i <terms;i++){
            if(array1[i]==find_it){
                System.out.println("a["+i+"]"+array1[i]);
                count ++;
            }
            
        }
        if(count==0){
            System.out.println("Entered element is not found in array.");
        }
        sc.close();
    }
}
