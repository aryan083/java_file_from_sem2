import java.util.*;
public class mathfun {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float a;
        
        System.out.println("Enter the number with fraction part:-");
        a=sc.nextFloat();
        
        System.out.println("the integer of given number is " + a);// (int)a would work the same
        System.out.println("The small integer of the given number is "+ (Math.abs(Math.ceil(a))));
        System.out.println("The bigger integer of the given number is " + (Math.abs(Math.floor(a))));
        sc.close();    
    }
    
}
