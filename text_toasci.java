import java.util.*;
public class text_toasci {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String text;
    int asci=0;
    System.out.println("Enter a string to be convete in to ASCII Code:- ");
    text=sc.next();
    for( int i =0 ; i<text.length();i++){
        asci = (int )text.charAt(i);
        System.out.println(asci);
    }sc.close();
}
}
