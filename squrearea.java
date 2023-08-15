import java.util.*;
public class squrearea {

    public int calarea(int  lenth){
        return lenth*lenth;
    }
    public static void main(String[] args) {
        
        int lenth,area;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the lehth of a square:-");
        squrearea r1=new squrearea();
        lenth=sc.nextInt();
        
        
        area= r1.calarea(lenth);
        System.out.println("Area= "+ area);
sc.close();
    }

    
}


