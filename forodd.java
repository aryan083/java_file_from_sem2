import java.util.*;
public class forodd{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i,num;
        System.out.println("Enter a number");
        num=sc.nextInt();
        sc.close();
        for (i=1;i<=num;i++)
        {
            if(i%2==1)
            {System.out.println(i+",");}
        }
    }
}