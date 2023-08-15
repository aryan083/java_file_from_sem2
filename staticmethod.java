import java.util.*;
class STATIC {
    double r;

    static void calulatearea( double r){// to claculate area
        double area= r*r*3.14;
        System.out.println("Area of circle with radius "+r +" = "+area );

}}
public class staticmethod {
    public static void main(String[] args) {
        double raidus;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of radius of cricle to calculate its area");
        raidus= sc.nextDouble();
        STATIC s1= new STATIC();
        STATIC.calulatearea(raidus);// to throw value of radius to r
        sc.close();
        
        
        
    }
}
