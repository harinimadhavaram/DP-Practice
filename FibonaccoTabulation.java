public class FibonaccoTabulation {
    public int fib(int n) {
        int dp[] = new int[n];
        dp[0] = 1;

        for (int i = 1; i < n; i++) {
            if (i <= 1) {
                dp[i] = dp[i - 1] * i;
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n - 1];
    }

    public static void main(String args[]) {
        FibonaccoTabulation obj = new FibonaccoTabulation();
        int n = 7;
        System.out.println(obj.fib(n));

    }
}