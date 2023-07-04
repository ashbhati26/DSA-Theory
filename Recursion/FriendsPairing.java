public class FriendsPairing {
    public static int friendsParing(int n){
        if(n == 1|| n == 2){
            return n;
        }
        // single
        int f1 = friendsParing(n-1);
        // pair
        int f2 = friendsParing(n-2);
        int pairWays = (n-1) * f2;
        // total ways
        int totalWays = f1 + pairWays;
        return totalWays;
        // return friendsParing(n-1) + (n-1) * friendsParing(n-2); // simple way
    }
    public static void main(String[] args) {
        System.out.println(friendsParing(3));
    }
    
}