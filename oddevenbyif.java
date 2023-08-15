import java.util.Scanner;
public class oddevenbyif
{

public static void main(String[] args)
{int a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number ");
a= sc.nextInt();
if(a%2==0)
{
System.out.println("the enterd number is even ");
}
if(a%2==1) 
{System.out.println("the enterd number is odd");}
sc.close();
}

}