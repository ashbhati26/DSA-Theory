package DynamicProgramming;

public class KnapsackRec {
    public static int Knapsack(int val[], int wt[], int W, int n){
        if(W == 0 || n == 0){
            return 0;
        }
        if(wt[n-1] <= W){
            int ans1 = val[n-1] + Knapsack(val, wt, W-wt[n-1], n-1);
            int ans2 = Knapsack(val, wt, W, n-1);
            return Math.max(ans1, ans2);
        }else{
            return Knapsack(val, wt, W, n-1);
        }
    }
    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;
        System.out.println(Knapsack(val, wt, W, val.length));
    }
    
}
