import java.util.Scanner;
class areaofcircle{
    public static void main (String[] args)
    {   
        Scanner sc= new Scanner(System.in);
        int r;
        double area;
        double pi=3.14;
        System.out.println("Enter the radius of circle :");
        r= sc.nextInt();
        area=r*r*pi;
        System.out.println("Area of circle is :- "+area);
        sc.close();
    }
}