import java.util.*;
class areaofcircle{
    int x ;
   
   public double aoe(int x)
   { double PI = 3.14; 
    double areaofcirlce= x*x*PI;
      return areaofcirlce;
    
   }
}

public class areabymeth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        areaofcircle a1=new areaofcircle();
        a1.x= sc.nextInt();
        
        double area= a1.aoe(a1.x);
        System.out.println("Area of circle is : - "+ area );
        sc.close();
    }
}
