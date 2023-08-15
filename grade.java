import java.util.*;
public class grade
{
public static void main(String[] args)
{
int m1,m2,m3,m4,m5,m6,avg;
Scanner sc =new Scanner(System.in);
System.out.println("Enter marks for 1 subject");
m1=sc.nextInt();
System.out.println("Enter marks for 2 subject");
m2=sc.nextInt();
System.out.println("Enter marks for 3 subject");
m3=sc.nextInt();
System.out.println("Enter marks for 4 subject");
m4=sc.nextInt();
System.out.println("Enter marks for 5 subject");
m5=sc.nextInt();
System.out.println("Enter marks for 6 subject");
m6=sc.nextInt();
avg=(m1+m2+m3+m4+m5+m6)/6;
if(avg>70)
{System.out.println("Distinstion");}
else if (avg>60 && avg<70)
{System.out.println("First Class");}
else if (avg>45 && avg<60)
{System.out.println("Second Class");}
else 
{System.out.println("Third Class");}
sc.close();
}}