import java.util.*;
public class fib {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,c,terms;
        System.out.println("Enter the amount of terms in Fibonacci series:-");
        terms=sc.nextInt();
        a=0;
        b=1;
        c=a+b;
        System.out.print(a+","+ b +"," + c + ",");
        for (int i=0;i<terms;i++)
        {a=b;
        b=c; 
        c=a+b;
        System.out.print(c+",");
    sc.close();
    }
    }
    
}
