//Write a java program to represent Abstract class with example
abstract class emptyclass{
    int a,b;
    abstract void display();
    abstract void sum();

}
class Logic extends emptyclass{
    int a=10;
    int b=12;
    public void display(){
        System.out.println("Abstact class method display instailized!.");
    }
    public void sum (){
        System.out.println("a+b = "+(a+b));
    }
}

public class Labassignment5Ques1 {
  public static void main(String[] args) {
    
    Logic l1= new Logic();
    l1.display();
    l1.sum();
  }  
}
