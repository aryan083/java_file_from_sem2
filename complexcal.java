import java.util.*;
class complex{
    double realnumber1;
    double imagnary_num1;
    double realnumber2;
    double imagnary_num2;

    public double Add_real(double realnumber1,double realnumber2 ){
        return (realnumber1+realnumber2);
    }
    public double Add_image(double imagnary_num1, double imagnary_num2){
        return (imagnary_num1+imagnary_num2);
    }
    public double subtract_real(double realnumber1,double realnumber2 )
    {return (realnumber1-realnumber2);}
    public double subtract_image(double imagnary_num1, double imagnary_num2){
        return (imagnary_num1-imagnary_num2);
    }
    public double product_real(double realnumber1,double realnumber2,double imagnary_num1, double imagnary_num2){
        return ((realnumber1*realnumber2)-(imagnary_num1*imagnary_num2));
    }
    public double product_image(double imagnary_num1, double imagnary_num2,double realnumber1,double realnumber2){
        return ((realnumber1*realnumber2)+(imagnary_num1*imagnary_num2));

    }
}
public class complexcal {
 public static void main(String[] args) {
    
    double real1;
    double imag1;
    double real2;
    double imag2;
    
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the real part of first number:-");
    real1=sc.nextDouble();
    System.out.println("Enter the imagnary part of first number:-");
    imag1=sc.nextDouble();
    System.out.println("Enter the real part of second  number:-");
    real2=sc.nextDouble();
    System.out.println("Enter the imagnary part of secoond number");
    imag2=sc.nextDouble();
    //System.out.println("Entered complex number is : - "+ real +"  "+ imag+"i");
    complex c1=new complex();
    double sum_real=c1.Add_real(real1, real2);
    double sum_image =c1.Add_image(imag1, imag2);
    System.out.println("sum :- " +sum_real +" + "+ sum_image+"i");
    double minus_real= c1.subtract_real(real1, real2);
    double minus_image=c1.subtract_image(imag1, imag2);
    System.out.println("Substract:- "+ minus_real+ " + "+ minus_image+"i");
    double multi_real= c1.product_real(real1, real2, imag1, imag2);
    double multi_image=c1.product_image(imag1, imag2, real1, real2);
    System.out.println("Product :- "+ multi_real +" + "+ multi_image+"i");
    sc.close();
}}
