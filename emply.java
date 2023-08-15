import java.util.*;

public class emply
{
public static void main (String[] args)
{
int sal,hra,da; 
float gs;
char stat;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the salary ");
sal=sc.nextInt();
System.out.println("Enter c/C for post of CEO or M/m for post of manager");
stat=sc.nextChar();
if(stat!='c' ||stat!='C' || stat!='M' || stat!='m')
if(sal<1500)
{ hra=(sal*10)/100;
da=(sal*90)/100;
 gs=hra+da+sal;
System.out.println(gs);
}
if(sal>=1500)
{
hra=500;
da=(sal*90)/100;
gs=hra+da+sal;
System.out.println(gs);}
if(stat=='m'||stat=='M')
{
hra=(sal*15)/100;
da=(sal*92)/100;
gs=hra+da+sal;
System.out.println(gs);}
if(stat=='m'||stat=='M')
{
hra=(sal*30)/100;
da=(sal*104)/100;
gs=hra+da+sal;
System.out.println(gs);}
sc.close();

}
}