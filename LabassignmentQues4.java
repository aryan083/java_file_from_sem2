interface Main{
    void a();
    void b();
    void c();
}

abstract class logic implements Main{
    public void a(){
        System.out.println(" It is a.");
    }
}
class logic2 extends logic{
    public void b(){
        System.out.println("It is b.");
    }

    public void c(){
        System.out.println("It is c.");
}}
public class LabassignmentQues4 {
    public static void main(String[] args) {
      Main m1 = new logic2();
      m1.b();
      m1.c();
    m1.a();
    }
}
