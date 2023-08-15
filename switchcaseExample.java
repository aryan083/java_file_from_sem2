import java.util.*;
class logic{
    public void cal(double a,double b,int c){
        double sum,product,diffrance,division;
        switch (c) {
            case 1:
                {sum= a+b;
                System.out.println("sum of "+ a+ " + "+b+" = " + sum);// to add entered numbers   
                }
                break;
            case 2:
            {
                diffrance=a-b;
                System.out.println("diffrance of "+ a+ " - "+b+" = " + diffrance);// to take diffrance of entered numbers 
            }break;
            case 3: 
            {
                product=a*b;
                System.out.println("product of "+ a+ " * "+b+" = " + product);// to take product of entered numbers 

            }break;
            case 4 :
            {if(b!=0){//if else to avoid exceprion off zero 
                division=a/b;
                System.out.println("division of "+ a+ " / "+b+" = " + division);// to take divison of entered numbers 
            }
            else{
                System.out.println("Division is not possible because denominator is zero");
            }
            }break;
            default: // to make sure choice is within the range of casees in switch case.
        System.out.println("Enter a proper command!");
                break;
        }
    }

    public void display() {
    }

    public void sum() {
    }
}
public class switchcaseExample {
    public static void main(String[] args) {
        double num1,num2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number form 1 to 4 for the following 1 for sum,2 for diffrance 3 for product, 4 for divison ");
        int choice =sc.nextInt();
        System.out.println("Enter two numbder to calculate entered command.");
        num1=sc.nextDouble();
        num2=sc.nextDouble();
        logic l1= new logic();
        l1.cal(num1, num2, choice);
        sc.close();

    }
}
