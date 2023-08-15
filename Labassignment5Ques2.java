//Write a java program to implement Interface using extends keyword.
 interface logic1 {
    public static final int b=56;
     abstract void logic1_for_interface();
    
} 
interface logic2 extends logic1 {
    public static final int a=65;
     abstract void logic2_for_interface();
    
} 

class forlogic1 implements logic1{
    public void logic1_for_interface(){
    System.out.println("Logic1  "+ b);
    }
}
class forlogic2 implements logic2{
    public void logic1_for_interface(){
        System.out.println(" interface Logic 2 extends logic 1 "+ b);
    }
    public void logic2_for_interface(){
        System.out.println(" interface Logic 2 extends logic 1 "+ a +"  "+ b);
    }
}


public class Labassignment5Ques2 {
public static void main(String[] args) {
    forlogic1 fl1= new forlogic1();
    forlogic2 fl2= new forlogic2();
    fl1.logic1_for_interface();
    fl2.logic1_for_interface();
    fl2.logic2_for_interface();
    
}    
}
