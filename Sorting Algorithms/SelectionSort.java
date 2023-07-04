public class SelectionSort {
    public static void selectionSort(int array[]){
        for(int turn = 0; turn < array.length; turn++){
            int minPos = turn;
            for(int j = turn+1; j < array.length; j++){
                if(array[minPos] > array[j]){
                    minPos = j;
                }
            }
            // swap
            int temp = array[minPos];
            array[minPos] = array[turn];
            array[turn] = temp;
        }
    }
    public static void printArray(int array[]){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        int array[] = {5, 4, 1, 3, 2};
        selectionSort(array);
        printArray(array);
    }
}
