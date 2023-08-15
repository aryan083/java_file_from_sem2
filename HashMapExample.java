import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a new HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 5);
        hashMap.put("Orange", 7);
        hashMap.put("Grape", 15);

        // Accessing values from the HashMap
        int appleQuantity = hashMap.get("Apple");
        System.out.println("Quantity of Apples: " + appleQuantity);

        // Updating a value in the HashMap
        hashMap.put("Banana", 8);

        // Removing a key-value pair from the HashMap
        hashMap.remove("Orange");

        // Checking if a key exists in the HashMap
        boolean containsKey = hashMap.containsKey("Grape");
        System.out.println("Contains Grape? " + containsKey);

        // Iterating over the HashMap
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String fruit = entry.getKey();
            int quantity = entry.getValue();
            System.out.println(fruit + ": " + quantity);
        }

        // Clearing the HashMap
        hashMap.clear();

        // Checking if the HashMap is empty
        boolean isEmpty = hashMap.isEmpty();
        System.out.println("Is HashMap empty? " + isEmpty);
    }
}
