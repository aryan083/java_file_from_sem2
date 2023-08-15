class MyAccount {
    int accNo;
    double balance;
    MyAccount(){}
}
public class MyBank {
 public static void main(String[] args) {
    MyAccount ma= new MyAccount();
    System.out.println("Balance = "+ ma.balance);
 }   
}
