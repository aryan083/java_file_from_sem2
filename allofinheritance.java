
class A {//the super class 
    int a = 45;
    String name = "This is a super class";
    public void display(){
        System.out.println(name+ "\n int a from class A = "+a );
    }


}
class B extends A{// sub class of A  example of single inherirtance 
    int b = 50;
    String name = "This is a sub class of A";
    public void display(){
        System.out.println("int a from a inheritaed to b = "+a);
        System.out.println("sum of a and b = "+a +" + "+b +" = "+ (a+b) );
    }

}
class C extends A{// As B as a sub class of A Example of Hierarchical inheritance
    int c= 55;
    String name = " This is a sub class of A";
    public void display(){
        System.out.println("Int a from class A inherted to c = "+a);
        System.out.println("The sum of a and c = "+ a+ " + "+c+" = "+(a+c) );
    }
}
class D extends C{// A sub class of C while C is sub class of A Example of multilevel inheritance
    int d = 60;
    String name = "This is a sub class of C which is a sub class of A"; 
    public void display(){
        System.out.println("Int c from class inherited by classss D");
        System.out.println("the sum of a c,d = "+a+" + "+ c  +" + " + d + " = "+ (a+c+d));
    }
}
    public class allofinheritance {
    public static void main(String[] args) {
        A a1 = new A();//object creation
        B b1 = new B();
        C c1 = new C();
        D d1 = new D();
        a1.display();//methid calling
        b1.display();
        c1.display();
        d1.display();

    }    
}
