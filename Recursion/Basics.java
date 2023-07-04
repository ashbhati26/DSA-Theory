public class Basics {
    // print numbers from n to 1 (in decreasing order)
    public static void printDec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }
    // print numbers form 1 to n (in increasing order)
    public static void printInc(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
         printInc(n-1);
        System.out.print(n + " ");
    }
    // print factorial of a number n
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fact(n - 1);
        return fn;
    }
    // print sum of n natural number
    public static int calSum(int n){
        if(n == 1){
            return 1;
        }
        int Snm1 = calSum(n-1);
        int Sn = n + Snm1;
        return Sn;
    }
    // print nth fibonacci number
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int f1 = fib(n - 1);
        int f2 = fib(n - 2);
        int fn = f1 + f2;
        return fn;
    }
    // check if array is shorted or not
    public static boolean isShorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isShorted(arr, i+1);
    }
    // first occurrence 
    public static int firstOcc(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOcc(arr, key, i+1);
    }
    // last occurrence
    public static int lastOcc(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOcc(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    // find power of x
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int xnm1 = power(x, n-1);
        int xn = x * xnm1;
        return xn;
    }
    // optimized power
    public static int optimizedPower(int a, int n){
        if(n == 0){
            return 1;
        }
        int halfPower = optimizedPower(a, n/2);
        int halfPowerSQ = halfPower * halfPower;
        // if n is odd
        if(n % 2 != 0){
            halfPowerSQ = a * halfPowerSQ;
        }
        return halfPowerSQ;
    }
    public static void main(String[] args) {
        // int n = 26;
        // printDec(n);
        // printInc(n);
        // System.out.println(fact(n));
        // System.out.println(calSum(n));
        // System.out.println(fib(n));
        // int arr[] = {1, 2, 3, 4, 5};
        // System.out.println(isShorted(arr, 0));
        // int arr[] = {6, 7, 8, 3, 8, 4, 12};
        // System.out.println(firstOcc(arr, 8, 0));
        // System.out.println(lastOcc(arr, 8, 0));
        // System.out.println(power(2, 10));
        // System.out.println(optimizedPower(2, 5));
    }
} 