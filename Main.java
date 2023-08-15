class Example {
    public int publicVar = 10;     // public variable
    private int privateVar = 20;   // private variable
    
    public void publicMethod() {   // public method
        System.out.println("This is a public method.");
    }
    
    private void privateMethod() { // private method
        System.out.println("This is a private method.");
    }
}

public class Main {
    public static void main(String[] args) {
        Example ex = new Example();
        
        System.out.println(ex.publicVar);   // prints 10
        ex.publicMethod();                  // prints "This is a public method."
        
        // The following lines will cause compile errors because the private
        // variable and method cannot be accessed from outside the Example class.
        // System.out.println(ex.privateVar);
        // ex.privateMethod();
    }
}