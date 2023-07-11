import java.util.*;
public class SizeOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add element
        list.add(1); //time complexity is O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.size());

        // print arraylist
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " "); 
        }
        System.out.println();
    }
}
