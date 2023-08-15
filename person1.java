import java.util.*;
public class person1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age;
        String name;
        System.out.println("Enter the name of person:- ");
        name=sc.nextLine();
        System.out.println("Enter Age:-");
        age= sc.nextInt();
        System.out.println("name:- "+ name+ "\n"+ "age:- "+ age);
        sc.close();
    }
    
}
