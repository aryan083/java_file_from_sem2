import java.util.*;
class prime 
{    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter A number:-");
        num= sc.nextInt();
        System.out.println("Prime numbers are");
        for(int i=2;i<=num;i++)
        {
        for(int k=2;k<=i;k++)
        {
        if(i%k==0)
        {
        if(i==k)
        {
        System.out.print(i+",");
        }
        break;
    }}}
sc.close();}}