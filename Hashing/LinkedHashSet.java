import java.util.*;
public class LinkedHashSet {
    public static void main(String[] args) {
        java.util.HashSet<String> cities = new java.util.HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        System.out.println(cities);

        java.util.LinkedHashSet<String> lhs = new java.util.LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");

        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bengaluru");

        System.out.println(ts);
    }
}