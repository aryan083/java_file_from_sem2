import java.util.Scanner;

public class sortarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int terms =sc.nextInt();
        int[] array= new int[terms];
        for (int i =0;i<terms;i++){
            array[i]=sc.nextInt();

        }
    int temp=0;
    for(int i=0;i<terms;i++){
        for(int j=i+1;j<terms;j++){
            if(array[i]>array[j]){
                temp=array[i];
                array[i]=array[j];
                array[j]=temp;
           }
        }
    }
    System.out.println("Sorted array");
    for(int i=0;i<terms;i++){
        System.out.println("a["+i+"] : - "+array[i]);
    }
    }

}
