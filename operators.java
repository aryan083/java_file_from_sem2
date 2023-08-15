import java.util.*;
public class operators {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum,diffrance,product,divison,num1,num2; // instance variables
        System.out.print("Enter Number 1:- ");
        num1= sc.nextDouble();//Enter first number
        System.out.println("Enter Number 2:-  ");//Enter Second number
        System.out.print("Zero is not accepted as in divison in denominator ");
        num2=sc.nextDouble();
        sum=num1+num2;
        diffrance=num1-num2;
        product=num1*num2;
        if(num2!=0 )
        //Line 17 to 28 for printing values
        {
            divison=num1/num2;
            System.out.println("Sum of "+ num1+" + "+num2 + " = "+sum);
            System.out.println("Diffrance of "+ num1+" - "+num2 + " = "+diffrance);
            System.out.println("Product of "+ num1+" * "+num2 + " = "+product);
            System.out.println("Divison of "+ num1+" / "+num2 + " = "+divison);
        }
        else{
            System.out.println("Sum of "+ num1+" + "+num2 + " = "+sum);
            System.out.println("Diffrance of "+ num1+" - "+num2 + " = "+diffrance);
            System.out.println("Product of "+ num1+" * "+num2 + " = "+product);
            System.out.println("Divison is not possible because num2 = 0");
            

        }

        sc.close();
    }
    
}
