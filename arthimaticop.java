import java.util.*;
class operations{
    double a,b,sum,minus,div,multi;
     public double sum(double a,double b) {
        sum= a+b;
        return sum;
     }
     public double minus(double a, double b){
        minus= a-b;
        return minus;
     }
     public double multi(double a,double b){
        multi= a*b;
        return multi;
     }
     public double div( double a, double b){
        if(b!=0){
            div= a/b;
            return div;

        }
        else {
            
            return 0;
        }
     }

}
public class arthimaticop {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    double x,y,plus,sub,div,multi;
    System.out.println("Enter Number A:-");
    x=sc.nextDouble();
    System.out.println("Enter Number B:-");
    y=sc.nextDouble();
    operations o1= new operations();
    plus=o1.sum(x,y);
    sub=o1.minus(x,y);
    multi=o1.multi(x,y);
    div=o1.div(x,y);
    System.out.println("The sum is - "+ plus);
    System.out.println("The diffrance is - "+ sub);
    System.out.println("the multipication is - "+ multi);


    if(div>1){
        System.out.println("divison is - "+ div);
    }
    else{
        System.out.println("Ennter a value other than zero for B");
    }
    

sc.close();
    }
    
}
