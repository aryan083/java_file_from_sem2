import java.util.*;
class vari{
    String str;
    String rev;
}
public class pelindrome {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        vari v1 = new vari();
        
        System.out.println("Enter A String : -");
        v1.str=sc.nextLine();   
        v1.rev=v1.str;
        //int x= v1.str.length();
        for (int i=v1.str.length()-1;i>=0;--i)
        {
            v1.rev= v1.rev+ v1.str.charAt(i);
        
        }
        //System.out.println(v1.rev);
        if(v1.str==v1.rev)
        {System.out.println("Given String is pelindrome ");}
        else 
        {System.out.println("Given String is not a pelindrome");}
        sc.close();
 }
}
