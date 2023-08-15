import java.util.Scanner;

class rectangle{
    static float height,width;
    static void calarea(){
        System.out.println("Area:-" + height*width);
    }
}
public class Myrec {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        rectangle r1=new rectangle();
        System.out.println("Enter the height :-");
        r1.height=sc.nextFloat();
        System.out.println("Enter THe width :-"); 
        r1.width=sc.nextFloat();
        rectangle.calarea();
    sc.close();
    }
    
}
