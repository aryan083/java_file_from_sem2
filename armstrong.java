import java.util.*;
 public class armstrong
{
public static void main(String[] args)
{
int num,realnum,reminder,n=0;
double result =0.0;
try (Scanner sc = new Scanner(System.in)) {
    System.out.println("Enter An Number:-");
    num=sc.nextInt();
    for(realnum=num;realnum!=0;++n)
    {realnum/=10; }
    
    
    for (realnum=num; realnum!=0;realnum/=10)
    {
    reminder= realnum % 10;
    result+=Math.pow(reminder,n);}
    if(result==num)
    {System.out.println(num+"Is An Armstrong Number");}
    else 
    {System.out.println(num+"Is Not An Armstrong Number");}
    sc.close();
}}
}