public class TilingProblem {
    public static int tiling(int n){ // 2 x n (floor size)
        // base case
        if(n == 0 || n == 1){
            return 1;
        }
        // vertical choice
        int f1 = tiling(n-1);
        // horizontal choice
        int f2 = tiling(n-2);

        int totalWays = f1 + f2;
        return totalWays;
        // return tiling(n-1) + tiling(n-2); // simple way
    }
    public static void main(String[] args) {
        System.out.println(tiling(4));
    }
}