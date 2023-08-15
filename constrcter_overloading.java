import java.util.Scanner;

class overload{
    int num1,num2,num3,num4;
    overload(){
        System.out.println("Default Constructer by o1");
    
    }
    overload(int num1,int num2){
        System.out.println("by o2:-  "+(num1+num2));
    }
    overload(int num1,int num2,int num3){
        System.out.println("by o3:-  "+(num1+num2+num3));
    }
    overload(int num1,int num2,int num3,int num4){
        System.out.println("by o4:-  "+(num1+num2+num3+num4));
    }
}
public class constrcter_overloading {
    public static void main(String[] args) {
        int num1,num2,num3,num4;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 4 numbers");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        num4=sc.nextInt();
        overload  o1=new overload();
        overload  o2=new overload(num1 ,num2);
        overload o3 = new overload(num1 ,num2,num3);
        overload o4 = new overload (num1 ,num2,num3,num4);
sc.close();


    }    
}
