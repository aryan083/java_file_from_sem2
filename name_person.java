import java.util.*;
class person{
    int age;
    String name;

    public void dispaly(int age,String name){
    System.out.println("Name:-" + name+ "\n"+ "Age:- "+ age);
        
        
    } 
}

public class name_person {
public static void main(String[] args) 
{
    int number;
    String name;
    Scanner sc= new Scanner(System.in);
    person p1=new person();
    System.out.println("Enter the name of person:- ");
    name=sc.nextLine();
    System.out.println("Enter the age:-");
    number=sc.nextInt();
     
    p1.dispaly(number, name);
    sc.close();
}
}
