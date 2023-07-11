import java.util.*;
public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add element
        list.add(2); //time complexity is O(1)
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println(list);
        // sort in asending order
        Collections.sort(list); 
        System.out.println(list);

        // sort in descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}