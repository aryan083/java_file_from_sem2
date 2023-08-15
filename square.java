import java.util.*;
class block{
    double height;
    double width;
}
class square{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        block s1= new block();//right syntax of object creation
        //square s2= new block();wrong syntax
        System.out.println("Enter Hight:-");
        s1.height= sc.nextDouble();
        System.out.println("Enter Weight:-");
        s1.width=sc.nextDouble();
        System.out.println(s1.height);
        System.out.println(s1.width);
sc.close();
    }
}
