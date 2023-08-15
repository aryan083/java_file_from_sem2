import java.util.Scanner;

public class circlearea2 {
    int radius;
    
    
    public double calarea(int radius,double pi){
        return pi*radius*radius;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double pi= 3.14;
        circlearea2 c1= new circlearea2();
       System.out.println("Enter the radius of circle:-");
        c1.radius= sc.nextInt();
        double area = c1.calarea(c1.radius, pi);
        System.out.println("Area of circle :- "+ area);
        sc.close();
    }

    
}
