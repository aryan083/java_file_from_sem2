import java.util.*;
public class BinarySearch {
    public static int logic(int[] array1,int num,int len) {
        int first_index=0;
        int last_index=array1.length-1;
        
           while(first_index<=last_index){
               int mid=(last_index+first_index)/2;
               if(array1[mid]==num){
                   return mid;
               }
               else if(array1[mid]<num){
                   first_index=mid+1;
               }
               else{
                   last_index=mid-1;
               }
              
           }
       
           return  -1;
   }
       public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of terms in array:-");
        int terms=sc.nextInt();
        int[] array1=new int[terms];
        for(int i= 0;i<terms;i++){
            System.out.println("array["+i+"]");
            array1[i]=sc.nextInt();
        }
        //Arrays.sort(array1);
        int temp=0;
    for(int i=0;i<terms;i++){
        for(int j=i+1;j<terms;j++){
            if(array1[i]>array1[j]){
                temp=array1[i];
                array1[i]=array1[j];
                array1[j]=temp;
           }
        }
    }
    
        System.out.println("Enter the number to be searched in array");
        int number=sc.nextInt();

        int number_Index=logic(array1,number,terms);
        if(number_Index==-1)
        {
            System.out.println("Given number "+number +" is not found in array");
        }
        else
        {
            System.out.println("Given number "+ number+" is found at index "+number_Index);
        }
            sc.close();

    }

    
}
