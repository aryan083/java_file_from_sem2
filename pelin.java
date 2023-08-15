import java.util.*;
public class pelin {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        
        //System.out.println("Enter A String : -");
        String str=sc.next();   
        String rev=str;
        String temp="";
        //int x=str.length();
        
        for (int i=0;i>=str.length();i++)
        { 
            if(str.charAt(i)==rev.charAt(str.length()-i))
            {temp=temp+str.charAt(i);}            //System.out.println(rev);
        }
        
        if(str.toLowerCase().equals(rev.toLowerCase()))
         {System.out.println("Given String is pelindrome ");}
         else 
         {System.out.println("Given String is not a pelindrome");}
    sc.close();
 }
}
