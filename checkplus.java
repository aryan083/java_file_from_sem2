import java.util.Scanner;
public class checkplus
{

public static void main(String[] args)
{int a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number ");
a= sc.nextInt();
if(a>0)
{
System.out.println("the enterd number is psoitive ");
}
else 
{System.out.println("the enterd number is not valid");}
sc.close();
}
}