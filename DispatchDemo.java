class A{
void display(){
System.out.println("INSIDE CLASS A");
}
}
class B extends A{
void display(){
System.out.println("INSIDE CLASS B");}
}
class C extends A{
void display(){
System.out.println("INSIDE CLASS C");}
}
class DispatchDemo{
public static void main(String[] args){
A a =new A();
B b= new B();
C c= new C();
A r;
r= a;

r.display();
r=b;
r.display();
r=c;
r.display();
}
}