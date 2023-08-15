import java.util.*;
class name{
    String name;
    int roll;
    name(){
        System.out.println("Enter Your Name:-");
        Scanner sc = new Scanner(System.in);
        name=sc.nextLine();
        System.out.println("Enter Your Roll Number:-");
        roll=sc.nextInt();
        System.out.println("Name:- "+ name);
        System.out.println("Roll Number:- "+ roll);
        sc.close();
    }
    name( name n){
        System.out.println("Name:- "+ name);
        System.out.println("Roll Number:- "+ roll);
    
    }
}


public class copy_name {
    public static void main(String[] args) {
    
        name n1=new name();
        name n2 =new name(n1);
        System.out.println("copy conststuctor: - "+ n2.name);
        
    }
}
