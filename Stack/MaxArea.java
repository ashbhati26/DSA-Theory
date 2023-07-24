import java.util.Stack;

public class MaxArea {
    public static void maxArea(int arr[]){
        int maxArea = 0;
        int nextSmallerRight[] = new int[arr.length];
        int nextSmallerLeft[] = new int[arr.length];

        // Next Smaller Right
        Stack<Integer> s = new Stack<>();
        for(int i = arr.length-1; i >= 0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextSmallerRight[i] = arr.length;
                // -1
            }else{
                nextSmallerRight[i] = s.peek();
                // top
            }
            s.push(i);
        }
        // Next Smaller Right
        s = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextSmallerLeft[i] = -1;
                // -1
            }else{
                nextSmallerLeft[i] = s.peek();
                // top
            }
            s.push(i);
        }
        // Current Area
        for(int i = 0; i < arr.length; i++){
            int height = arr[i];
            int width = nextSmallerRight[i] - nextSmallerLeft[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }
        System.out.println("max area in histogram is : " + maxArea);

    }
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 2, 3};
        maxArea(arr);
    }   
}