import java.util.*;
public class table{
    public static void main(String[] args) {
        int num,i=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        num=sc.nextInt();
        while (i <=10)
        {
            System.out.println(num+"x"+i +"=" +num*i);
            i++;
        }
    sc.close();}
}