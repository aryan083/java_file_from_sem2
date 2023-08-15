public class OuterClass {
    private int outerPrivateVar = 10;
    public int outerPublicVar = 20;

    private class InnerClass {
        private int innerPrivateVar = 30;
        public int innerPublicVar = 40;

        private void innerPrivateMethod() {
            System.out.println("This is a private method in InnerClass.");
        }

        public void innerPublicMethod() {
            System.out.println("This is a public method in InnerClass.");
        }
    }

    public void outerPublicMethod() {
        InnerClass inner = new InnerClass();
        inner.innerPublicMethod();
        System.out.println("OuterClass private variable: " + outerPrivateVar);
        System.out.println("InnerClass private variable: " + inner.innerPrivateVar);
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        System.out.println("OuterClass public variable: " + outer.outerPublicVar);

        InnerClass inner = outer.new InnerClass();
        System.out.println("InnerClass public variable: " + inner.innerPublicVar);

        outer.outerPublicMethod();
        // The following line will cause a compile error because InnerClass is private.
        // InnerClass inner2 = new InnerClass();
    }
}
