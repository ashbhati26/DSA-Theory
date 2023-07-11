import java.util.*;
public class OperationsOnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add element
        list.add(1); //time complexity is O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(1, 9);

        System.out.println(list);

        // // get operation
        // int element = list.get(2); // time complexity is O(n)
        // System.out.println(element);

        // // remove element 
        // list.remove(2); // time complexity is O(1)
        // System.out.println(list);

        // // set value
        // list.set(1, 10); // TC is 
        // System.out.println(list);

        // // contain
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));
    }
}