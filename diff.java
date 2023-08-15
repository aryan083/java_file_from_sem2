import java.util.*;
class checkplus
{
public static void main(String[] args)
{int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number A");
a= sc.nextInt();
System.out.println("Enter a number B");
b= sc.nextInt();
c=a-b;


if(c>0)
{
System.out.println("Diffrance is positive ");
}
if(c<0) 
{System.out.println("Diffrance is negative");}

if(c==0)
{System.out.println("Diffrance is zero");}
sc.close();
}}