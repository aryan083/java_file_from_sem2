public class personwithinheritance {
    public void display(){
        System.out.println("num = "+contact);
       }
    public static void main(String[] args) {
    String name="Madra";
   long contact=9112611;
    
}
}
class Employee extends personwithinheritance{
    int empID=911;
    String designation;
}
class Customer extends personwithinheritance{
int CustomerID=118299;
int inVoiceNo=45837;
}