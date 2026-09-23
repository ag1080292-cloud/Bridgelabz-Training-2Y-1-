package Hashmap;
import java.util.*;
public class demo {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();

        // put() -> Add key-value pairs
        marks.put("Rahul", 85);
        marks.put("Priya", 92);
        marks.put("Aman", 78);
        marks.put("Rahul", 90);

        System.out.println("HashMap: " + marks);

        // get() -> Get value using key
        System.out.println("Marks of Priya: " + marks.get("Priya"));

        // containsKey() -> Check if key exists
        System.out.println("Contains key 'Aman'? " +
                marks.containsKey("Aman"));

        // containsValue() -> Check if value exists
        System.out.println("Contains value 92? " +
                marks.containsValue(92));

        // remove() -> Remove a key-value pair
        marks.remove("Aman");
        System.out.println("After removing Aman: " + marks);

        // keySet() -> Get all keys
        System.out.println("All Keys: " + marks.keySet());

        // values() -> Get all values
        System.out.println("All Values: " + marks.values());

        // entrySet() -> Get all key-value pairs
        System.out.println("Key-Value Pairs:");
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // getOrDefault() -> Return value or default value
        System.out.println("Rohan's Marks: " +
                marks.getOrDefault("Rohan", 0));

        // size() -> Number of key-value pairs
        System.out.println("Size: " + marks.size());

        // isEmpty() -> Check if HashMap is empty
        System.out.println("Is Empty? " + marks.isEmpty());

        // clear() -> Remove all entries
        marks.clear();
        System.out.println("After clear(): " + marks);

        // isEmpty() after clear
        System.out.println("Is Empty Now? " + marks.isEmpty());
    }
}


