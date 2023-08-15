import java.util.Scanner;
public class factorialcal {

    public static long cal(int num){
         long fact=1;

        for(int i =num;i>=1;i--){
           // temp=temp*i;
            fact=fact*i;
        }
        return fact;
    }


    public static void main(String[] args) {
       int num;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to find its factorial:- ");
        num=sc.nextInt();
        long fact =factorialcal.cal(num);
        System.out.println("factorial :- " + fact);
        sc.close();


        


    }
}
