import java.util.Scanner;
//Here interfcae of Boitcoin ,Paypal and Credit card extends the payment Process Inter face
//
interface Payment_Process {
    static void Way_of_payment( int choice ){};
    static void passWord(){};
  //  static void amounnt(int amounnt){};
   // static void confirm_Amouunt(int confirm_Amouunt){};
    static void bill_pass(int ammount, int confirm_Amouunt){};
    
}
class BitCoin implements Bit_Coin{//Bit Coin class to implement the Bit Coin Interface
    public static void TransectionID(){
        System.out.println("Enter the transction ID for Yor payment ");
        Scanner sc= new Scanner(System.in);
        String TranID= sc.next();
        System.out.println("Name : - XYZ ABC");
        System.out.println("Phone No. :- ********** ");
    }
}
class PayPal implements Paypal{//paypal Class to implemnt paypal Interface
public static void PayPal_Number(){
    System.out.println("Enter the Paypal Number :-");
    Scanner sc= new Scanner(System.in);
    int paypal_NUmber=sc.nextInt();
    System.out.println("Name : - XYZ ABC");
    System.out.println("Phone No. :- ********** ");
}
}
class CreditCard implements Credit_Card
{//Credit card class to implent credit class interfce
    public static void Credit_Card_Number(){
        System.out.println("Enter your credit Card Number :-");
        Scanner sc= new Scanner(System.in);
        int CraditCard_Number=sc.nextInt();
        System.out.println("Name : - XYZ ABC");
        System.out.println("Phone No. :- ********** ");
        System.out.println("Enter the CV Code from Back of Credit Card:- ");
    }
}



class payment implements Payment_Process {
    public static void Way_of_payment(int choice){
        if(choice ==1){
            
            BitCoin.TransectionID();
            
        }
        else if(choice ==2){
            PayPal.PayPal_Number(); 
        }
        else if(choice ==3){
            CreditCard.Credit_Card_Number();
        }
        else{
            System.out.println("Enter a valid payment method");
        }
         
    }
    public static void passWord(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the PassWord :- ");
        int PassWord=sc.nextInt();
    }
    // public static void amounnt( int amo){
    //     System.out.println("Enter the Amounnt :- ");
    //     Scanner sc= new Scanner(System.in);
    //     int amounnt =sc.nextInt(); 
    // }
     public static void bill_pass( int amounnt,int ca){
        if(ca == amounnt){
        System.out.println("Payment Sucessful!");
        System.out.println("Total Bill Ammount:- "+amounnt);
        System.out.println("Name : - XYZ ABC");
        System.out.println("Phone No. :- ********** ");
    }
        else{
            System.out.println("Payment Unsucessful!!!");
            System.out.println("We are sorry for your Inconvinance");
        }
}
}
interface Bit_Coin extends Payment_Process{
    static void TransectionID(){};
    }
interface Paypal extends Payment_Process{
    static void PayPal_Number(){};
}
interface Credit_Card extends Payment_Process{
    static void Credit_Card_Number(){};
}


public class LHCQ2 {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Chocie for Payment 1 for Bit-Coin , 2 for PayPal, 3 for Credit-Card");
        int choice=sc.nextInt();
        Payment_Process.Way_of_payment(choice);
        System.out.println("Enter the Amounnt :- ");
        int Ammount=sc.nextInt();
        //Payment_Process.amounnt(Ammount);
        System.out.println("Enter the amounnt to Confirm it:- ");
        int confirm_Amouunt=sc.nextInt();
        //Payment_Process.confirm_Amouunt(confirm_Amouunt);
        payment.passWord();
        payment.bill_pass(Ammount,confirm_Amouunt);

        sc.close();
    }
}
