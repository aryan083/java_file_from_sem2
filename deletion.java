import java.util.Scanner;
import java.util.Arrays;
public class deletion {
    int size,capacity=100,index,added_Element;
    int [] array= new int[capacity];

    deletion(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Eter the Size Of Array");
        this.size= sc.nextInt();
    }

    public void traversalEntry(){
        Scanner sc= new Scanner(System.in);   
        for(int i=0;i<size;i++){
            System.out.println("Enter the "+i+"th element of Array");
            array[i]=sc.nextInt();

        }
    }
    public void display(){
        for(int i=0;i<size;i++){
            System.out.println("Enter the "+i+"th element of Array :- "+array[i]);  
        }
    }

    public int INTdeletion(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Index of element which We Want to delete");
        index =sc.nextInt();
      //  System.out.println("Enter the Element you want ot add at index "+ index);
       // added_Element= sc.nextInt();
       
       if(index>capacity & index>size){
            return -1;
        }
        else {
            
    
            for (int i=index; i <=size;i++){
                array[i]=array[i+1];

            
            }
           // array[index]=added_Element;
            size--;    
            return 1;
        }

    }
public static void main(String[] args) {
    
    deletion i1= new deletion();
    i1.traversalEntry();
    i1.display();
    i1.INTdeletion();
    i1.display();
        }
}

    

