class A{
    long name=4567;
    void display(){
        System.out.println("name : "+name);
    }
}
class B extends A {
    long number=912611;
    void display(){
        System.out.println("Number : "+number);
    }
    void add_two(){
        System.out.println("sum by class B : "+(number+name));
    }
}
class C extends B{
    long time=5010;
    void display(){
        System.out.println("Time : "+time);
    }

    void sum_all(){
        System.out.println("Number "+ (time+number+name));
        
    }
}
public class inhertancemultilevel {
    public static void main(String[] args) {
        A a1= new A();
        B b1= new B();
        C c1=new C();
        a1.display();
        b1.display();
        b1.add_two();
        c1.display();
        c1.sum_all();
    }
}
