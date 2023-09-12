import java.util.*;

public class HashingOperation {
    public static void main(String[] args) {
        // create
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        // Get - O(1)
        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Indonesia"));

        // containskey - O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        // remove
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        // size
        System.out.println(hm.size());

        // isempty
        System.out.println(hm.isEmpty());

        // clear function
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}