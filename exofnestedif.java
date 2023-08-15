import java.util.*;
class logic {
    int a,b,c;
    public void nestedif(int a,int b,int c){
        if(a>b){//to check if a is bigger in a,b,c if not second if for b and c will excucute 
            if(a>c){
            System.out.println("Number "+ a +" is biggest");}

            else{
                
                    System.out.println("Number "+ c +" is biggest");
                }
            
            }
        
        if(b>c){ // if true b is biggest bif not c is biggest 
            System.out.println("Number "+ b +" is biggest");
        
        }
        else {
            System.out.println("Number "+ c +" is biggest");
        }
        if(a==b&&a==c){
            System.out.println("All enterd nummbers are same!");
        }

    }}
public class exofnestedif {
    public static void main(String[] args) {
        int num1 ,num2, num3 ;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Three number to find biggest amoung them");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        logic l1= new logic ();
        l1.nestedif(num1, num2, num3);
        sc.close();
    }
}
