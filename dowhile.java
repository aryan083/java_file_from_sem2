import java.util.Scanner;
class SwitchCase{
    double num1,num2;
    public void display(double num1,double num2){
        double sum,product;
        sum =num1+num2;
        product = num1*num2;
        System.out.println("sum:- "+sum);
        System.out.println("Product :- "+ product);
    }


}
//wAP to implent a do while switch case in java
public class dowhile {
    public static void main(String[] args) {
        int i=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to printed itll that number form zero. ");
        int num= sc.nextInt();
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        SwitchCase s1=new SwitchCase();
        s1.display(a,b);
        do{
            i++;
            System.out.println(i);
        }while(i<=num);
        sc.close();
        
    }
    
}
