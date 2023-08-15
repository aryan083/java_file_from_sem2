import java.util.Scanner;
public class factorialcalbyrecurscion {    
    public static long cal(int num){ 
        if(num<=0)
        {
        return 0;
        }
        else if(num==1)
        {    
        return 1;
        }
        else
        {   
         return num*factorialcalbyrecurscion.cal(num-1);
        }
}


    public static void main(String[] args) {
       int num;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to find its factorial:- ");
        num=sc.nextInt();
        long fact =factorialcalbyrecurscion.cal(num);
        System.out.println("factorial :- " + fact);
        sc.close();


        


    }
}
