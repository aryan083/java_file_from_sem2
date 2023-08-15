class A{
    protected int i;
    int j;
    void Showij(){
        System.out.println("i = "+ i+ " J = "+ j);
    }
}
class B extends A{
    int k ;
    void Showk(){
        System.out.println("k = "+k);
    }
    void add(){
        System.out.println("i+j+k = "+(i+j+k));
    }
}
public class inheritanceDemo {
    public static void main(String[] args) {
        A superObjA=new A();
        superObjA.i=10;
        superObjA.j=20;
        B subObjB= new B();
        subObjB.k=30;
        superObjA.Showij();
        subObjB.Showk();
        subObjB.add();  
        System.out.println(superObjA.i);
        System.out.println(superObjA.j);     
    }
}
