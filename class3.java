class Class2 {
    int num_of_windows;
    int num_of_people;
    Class1 cl1=new Class1();
    Class2(){
        System.out.println("obj of class1 in class2"); 
        num_of_people=19;
        num_of_windows=20;
    }
}
class Class1{
    int num1;
    double num2;
    Class2 cl2=new Class2();
    Class1(){
        System.out.println("obj of class2 in class1");
        num1=10;
        num2=23.3;
    }
}
public class class3 {
    public static void main(String[] args) {
        System.out.println(cl1.num1);
        System.out.println(c.num2);
       
    }    
}
