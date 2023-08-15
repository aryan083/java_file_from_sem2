import java.util.*;

public class celtof{

    public static void main(String[] args) {
    float c,f;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the temrature in fernhite");
    f = sc.nextFloat();
    c=(((f-32)*5)/9);
    System.out.println(c + "To farnhite is " + f);
sc.close();
        
    }
}