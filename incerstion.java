import java.util.Scanner;
import java.util.Arrays;
public class incerstion {
    int size,capacity=100,index,added_Element;
    int [] array= new int[capacity];

    incerstion(){
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

    public int INTincerstion(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Index in which We Want to Enter the New Element");
        index =sc.nextInt();
        System.out.println("Enter the Element you want ot add at index "+ index);
        added_Element= sc.nextInt();
        if(index>capacity){
            return -1;
        }
        else {
            size++;
            for (int i=index ; i <=size;i++){
                array[i+1]=array[i];

            
            }
            array[index]=added_Element;
            
            return 1;
        }
    }
public static void main(String[] args) {
    
    incerstion i1= new incerstion();
    i1.traversalEntry();
    i1.display();
    i1.INTincerstion();
    i1.display();
        }
}

    

