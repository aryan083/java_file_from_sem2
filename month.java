import java.util.*;
public class month
{
public static void main (String[] args)
{int num;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number form 1 to 12");
num=sc.nextInt();
if(num==1){
System.out.println("January");
}
else if(num==2)
{System.out.println("Febuary");}
else if(num==3)
{System.out.println("march");}
else if(num==4)
{System.out.println("April");}
else if(num==5)
{System.out.println("May");}
else if(num==6)
{System.out.println("june");}
else if(num==7)
{System.out.println("July");}
else if(num==8)
{System.out.println("Auguest");}
else if(num==9)
{System.out.println("Semptember");}
else if(num==10)
{System.out.println("October");}
else if(num==11)
{System.out.println("November");}
else if(num==12)
{System.out.println("Decmeber");}
else {System.out.println("Enter a valid number");}
sc.close();}}