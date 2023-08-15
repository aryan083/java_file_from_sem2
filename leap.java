import java.util.*;
public class leap
{public static void main(String[] args)
{int a;
Scanner sc =new Scanner(System.in);
System.out.println("enter a year");
a= sc.nextInt();
if(a%4==0)
{System.out.println("The entered Year is a Leap  Year");}
else 
{System.out.println("The enterd year is not a leap year");}
sc.close();
}}