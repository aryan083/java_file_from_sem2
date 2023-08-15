import java.util.*;
class employee1
{
    int empid;
    String emp_name;
    String city;
    int yoj;
    
} 
public class employe {
    
    public static void main(String[] args) {
    
        Scanner sc= new Scanner(System.in);
        employee1 e1= new employee1();
        System.out.println("Enter the employee name:-");
        e1.emp_name= sc.nextLine();
        System.out.println("Enter the employee CIty:- ");
        e1.city= sc.nextLine();
        System.out.println("Enter the employee ID Number:-");
        e1.empid=sc.nextInt();
        System.out.println("Enter the  Year of joinning of employee");
        e1.yoj=sc.nextInt();
        
        System.out.println("employee name: -" + e1.emp_name + "\n" + "employee ID : -"+
                             e1.empid +"\n" + "city : -"
                             + e1.city +  "\n" +
                              "Year of Joinning:-" + e1.yoj+ "\n");
        
     sc.close();   
    }
    
}
