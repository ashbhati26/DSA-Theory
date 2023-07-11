import java.util.*;
public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add element
        list.add(1); //time complexity is O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // reverse print - O(n)
        for(int i = list.size()-1; i >= 0; i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    
}
