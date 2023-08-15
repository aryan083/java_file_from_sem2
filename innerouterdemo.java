class Outer{
    private int a =100;
    void outerMath(){
        Inner i= new Inner();
        System.out.println("inside Outer math()...");
        i.innerMeth();
    }
    class Inner{
        int b=20;
        void innerMeth(){
            System.out.println("inside innermath()..."+(a+b));
        }
    }
}
public class innerouterdemo {
    public static void main(String[] args) {
        Outer o =new Outer();
        o.outerMath();
    }
}
