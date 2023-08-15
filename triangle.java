import java.util.*;
public class triangle
{
public static void main(String[] args)
{int a,b,c,sum;
Scanner sc= new Scanner(System.in);
System.out.println("Enter angle A");
a=sc.nextInt();
System.out.println("Enter angle B");
b=sc.nextInt();
System.out.println("Enter angle C");
c=sc.nextInt();
sum=a+b+c;
if(sum>180)
{System.out.println("not valid");}
else 
{System.out.println("VALID");}
sc.close();}
}
