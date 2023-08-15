public class staticdemo {
     static int a=5;
    static int b;
    static void disval(int x){
        System.out.println("Static method initialized");
        System.out.println("x = "+x);
        System.out.println("a = "+ a);
        System.out.println("b = "+b);

    }
    static {
        System.out.println("Static block imitialized");
        b=a*5;
    }  
    public static void main(String[] args) {
        System.out.println("inside main()...");
        disval(44);
    }
}
