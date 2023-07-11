import java.util.ArrayList;

public class FindMax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add element
        list.add(2); //time complexity is O(1)
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(6);

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++){
            max = Math.max(max, list.get(i));
        }
        System.out.println("max element = " + max);
    }
}