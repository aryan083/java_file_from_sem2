import java.util.* ; 
public class fibnaci
{
    public static void main(String[] args) {

        Scanner sc =new Scanner (System.in);

        int num,a=0,b=1;

        System.out.println("Enter How Many Terms You Want The Fibonacci Series");
        num = sc.nextInt();

        System.out.print(0 + " " + 1 + " ");

        int c = Fibonacci(a,b,num);

        System.out.print(c + " ");
sc.close();
    }

    public static int  Fibonacci(int x,int y,int num)
    {
        num--;
        int z=x+y;

        if(num<=2)
        {
            return x + y ;
        }

        else
        {
            System.out.print(z + " ");
            return  Fibonacci(y,z,num) ; 
        }
        
    }}