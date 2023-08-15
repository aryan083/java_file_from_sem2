import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionFrameworkExample {
    public static void main(String[] args) {
        // ArrayList Example
        List<String> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        arrayList.add("Lion");
        arrayList.add("Dog");
        arrayList.add("Cat");
        arrayList.add("Monkey");
        arrayList.add("Parrot");

        // Accessing elements using thefor loop
        System.out.println("ArrayList elements:");
        for (String animal : arrayList) {
            System.out.println(animal);
        }

        // HashSet Example
        Set<Integer> hashSet = new HashSet<>();

        // Adding elements to the HashSet
        hashSet.add(11);
        hashSet.add(12);
        hashSet.add(13);
        hashSet.add(14);
        hashSet.add(15);

        // Accessing elements using an Iterator
        System.out.println("\nHashSet elements:");
        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
