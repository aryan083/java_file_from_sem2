import java.util.Scanner;

public class intrest {
    public double calintrest(double intrest,double time,double rate)
    {
        return  (intrest*(1+rate*time));
    }
    

    double princple,intrest,time,rate;
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    intrest i1= new intrest();
        
        System.out.println("Enter the time :-");
        i1.time =sc.nextDouble();
        System.out.println("Enter the rate :-");
        i1.rate=sc.nextDouble();
        System.out.println("Enter the intrest  ");
        i1.intrest=sc.nextDouble();
        i1.princple=i1.calintrest(i1.intrest,i1.time , i1.rate);
        System.out.println("principle :- "+ i1.princple);
        sc.close();
    }

}
