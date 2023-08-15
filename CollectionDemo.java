import java.util.*;
public class CollectionDemo {
    public static void main(String[] args) {
        List a1= new ArrayList();
        a1.add("Aryan");
        a1.add("Umang");
        a1.add("Krish");
        System.out.println("ArrayList Elements: -");
        System.out.print("\t"+a1);
        List l1=new LinkedList();
        l1.add("Mahida");
        l1.add("Hirani");
        l1.add("Mamtora");
        System.out.println();
        System.out.println("Linked List Elements: - ");
        System.out.print("\t"+l1);
    }
}
