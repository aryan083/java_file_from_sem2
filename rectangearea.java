import java.util.*;
public class rectangearea {

    public int calarea(int  lenth ,int width){
        return lenth*width;
    }
    public static void main(String[] args) {
        int lenth,width,area;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the width and lenth of rectangle:-");
        rectangearea r1=new rectangearea();
        lenth=sc.nextInt();
        width=sc.nextInt();
        
        area= r1.calarea(lenth, width);
        System.out.println("Area= "+ area);
sc.close();
    }

    
}
