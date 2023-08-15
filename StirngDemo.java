public class StirngDemo {
    public static void main(String[] args) 
        
    
    {String Str1= new String("YOUR NAME IS ");
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






}
}
