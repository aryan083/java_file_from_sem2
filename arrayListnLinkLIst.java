import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class arrayListnLinkLIst {
    public static void main(String[] args) {
       // ArrayList<String> AL1= new ArrayList<String>(5);
        try (Scanner sc = new Scanner(System.in)) {
            // Iterator<String> itr= AL1.iterator();
            // System.out.println("Enter a string");
               
            // while(sc.hasNext()){
            //     System.out.println("Enter a string");
            //     AL1.add(sc.nextLine());
            //     if(sc.hasNext("END")){
            //         System.out.println("Array-List Elements:- "+"\t"+AL1);
            //         break;
            //     }
            // }
            // System.out.println("Array-List Elements:- "+"\t"+AL1);
            
            LinkedList<String> l1= new LinkedList<>();
            for(int i =0 ;i<5 ;i++){
                l1.add(sc.next());

            }
            System.out.println("Lined List Elements :-"+ l1);
         }
    }

}
