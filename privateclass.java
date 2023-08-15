//WAP to implement public and private modifier in class.
class News{
    int m=5;
    private class inn{
        int x=4;
    }
}

public class privateclass {
    public static void main(String[] args) {
    News n1= new News();
    //System.out.println(n1.x);
    System.out.println("Outer class variable:- " +n1.m);    
    }
}
/* private class must an inner class to for to be used. 
private classes can't be acceced by other classes which are out of outer class */
