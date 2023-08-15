import java.util.Scanner;

public class LabExperiment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer str1=new StringBuffer("");
        System.out.println("Enter the String: -");
        str1.append(sc.nextLine());
        StringBuffer str2=new StringBuffer("");
        System.out.println("Enter the String:- ");
        str2.append(sc.nextLine());
        System.out.println("str2: " + str2);//append function is used to take input values of strings
        System.out.println("str1: " + str1);
        //insert function used here
        System.out.println("Insert function used "+str1.insert(5,str2));
        System.out.println("repalce :- "+str1.replace(1,3,"NO" ));
        System.out.println("delete:- "+ str1.delete(1,3));//delete
        System.out.println("reverse"+ str1.reverse());//reverse used 
        System.out.println("capacity of string:-"+str1.capacity());//capacity used here bydeafult it is 1.
        str1.ensureCapacity(45);//ensure capacity used change capacity to (newCapacity*2+2)
        System.out.println("EnsureCapacity:- "+ str1.capacity());
        System.out.println("Char at :-"+str1.charAt(3));//char at used here 
        System.out.println("Length:-"+str1.length());//length used here to have total number of char.
        System.out.println("Substring:- "+ str1.substring(3));
        System.out.println("Substring with end index"+ str1.substring(3,5));
        str1.toString();//used to turn string buffer to string
        String Str1= new String("YOUR NAME IS ");
    String Str2= new String("Your name is ");
    System.out.println(Str1.length());
    System.out.println(Str1.charAt(2));
    String Sub= Str1.substring(4, 11);
    System.out.println(Sub);
    System.out.println(Str1.indexOf(Str2, 5));
    boolean b= Str1.equals(Str2);
    boolean a= Str1.equalsIgnoreCase(Str2);
    System.out.println(b +"\n"+a);
    int diffrance= Str1.compareTo(Str2);
    int diff= Str1.compareToIgnoreCase(Str2);
    System.out.println(diffrance +"\n"+ diff);
String Str3 = new String ("  Ea- l ");
String Str4 = new String ("Word 1 and word2");
String Str5 = Str3.trim();
String Str6= Str4.replace('W', 'I');
String Str7= Str4.replace("Word", "Letter");
System.out.println(Str3+ "\n"+ Str4+"\n"+Str5+"\n"+Str6+"\n"+Str7+"\n"+Str1.toLowerCase()+"\n"+Str1.toUpperCase());

        
        sc.close();            
    
    
    
      
    }
}
