import java.util.*;
public class big3 { 
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int a,b,c;
    System.out.println("Enter the number A:-");
    a=sc.nextInt();
    System.out.println("Enter the number B:-");
    b=sc.nextInt();
    System.out.println("Enter the number C:-");
    c=sc.nextInt();
    if(a>b &&a>c)
    {System.out.println(a + " Is The biggest number");}
    else if (b>a &&b>c)
    {System.out.println(b + " Is The biggest number");}
    else if(c>a && c>b)
    {System.out.println(c + " Is The biggest number");}
    else 
    {System.out.println("All entered nunmbers are same!");}
    sc.close();
}    
}
