import java.util.Scanner;


public class Calculus {
    
    public static void Display(){
    }
    

    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter your Name: - ");
        String name = sc.nextLine();
        System.out.println("ENter Your Friend's Name: - ");
        String YourName= sc.nextLine();
        System.out.println("Enter three coefficents For A Quadratic :- ");
        System.out.println("Enter A: - ");
        int a=sc.nextInt();
        System.out.println("Enter B : - ");
        int b= sc.nextInt();
        System.out.println("Enter C: - ");
        int c= sc.nextInt();

        System.out.println("The Quadtratic Equation is : - ");
        System.out.println(a+"X^2 + "+b+"X + "+c);
        
        System.out.println("The derivative of Equation : - ");
        System.out.println((2*a)+"X + "+b);

        System.out.println("Enter any Value for X :- ");
        Double x= sc.nextDouble();
        System.out.println("The Value of Derivative of Quadratic Equation for Value of X = "+x+"is :- "+((2*a*x)+b));
        System.out.println("The antiderivative of Equation :-");
        System.out.println((a/3)+"X^3 + "+(b/2)+"X^2 + "+c+"X");
        System.out.println(YourName+" you own "+ name +" forever!");
        sc.close();
    
    } 

}
