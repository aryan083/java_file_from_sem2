
//static method

import java.util.*;

class circle
{
    static float radius ;

    static void calArea()
    {
        System.out.println("Area Of circle Is "+ 3.14*radius*radius);
    }
}

public class Circlearea 
{
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The radius Of Circle:-");
        circle.radius = sc.nextFloat();
        circle.calArea();
        sc.close();
    }
}