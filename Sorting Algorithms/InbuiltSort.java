import java.util.*;
public class InbuiltSort {

    public static void printArray(Integer array[]){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        // int array[] = {5, 4, 1, 3, 2};
        // sort array in ascending order
        // Arrays.sort(array);
        // printArray(array);
        // sort array from starting index to ending index
        // Arrays.sort(array, 0, 3);
        // printArray(array);
        Integer array[] = {5, 4, 1, 3, 2};
        // sort array in descending order
        // Arrays.sort(array, Collections.reverseOrder());
        // printArray(array);
        // sort array from starting index to ending index in descending order
        Arrays.sort(array, 0, 3, Collections.reverseOrder());
        printArray(array);
    }
}
