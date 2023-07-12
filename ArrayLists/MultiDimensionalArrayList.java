import java.util.ArrayList;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        // 2d arrayList
        // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // mainList.add(list);
        
        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(3);
        // list2.add(4);
        // mainList.add(list2);

        // for(int i = 0; i < mainList.size(); i++){
        //     ArrayList<Integer> currList = mainList.get(i);
        //     for(int j = 0; j < currList.size(); j++){
        //         System.out.print(currList.get(j) + " ");
        //     }
        //     System.out.println();
        // }
        // System.out.println(mainList);

        // multi dimensional arraylist
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i = 1; i <= 5; i++){
            list1.add(i*1); // 1 2 3 4 5
            list2.add(i*2); // 2 4 6 8 10
            list3.add(i*3); // 3 6 9 12 15
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);
    }
}