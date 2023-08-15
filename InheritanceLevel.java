

class A{
    protected int i;
    int j;
    void showij(){
        System.out.println("inside class A : i "+i+" j "+j);
    }
}
class B extends A{
    int k;
    void showk(){
        System.out.println("inside class B : k = "+k);}
    void add_ijk(){
            System.out.println("i +j +k "+(i+j+k));
        }
    }
    class C extends A{
        int m;
    void showm(){
        System.out.println("inside class C : m= "+m);
    }
    void add_ijm(){
        System.out.println("i+j+m= "+(i+j+m));
    }

    }
public class InheritanceLevel {
    public static void main(String[] args) {
       A a1= new A();
       B b1= new B();
       C c1= new C();
       a1.i=45;
       a1.j=25;
       b1.k=40;
       c1.m=50;
       c1.add_ijm(); 
       c1.showm();
       b1.showk();
       b1.add_ijk();
       a1.showij(); 
    }
    
}
