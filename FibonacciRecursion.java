public class FibonacciRecursion {
    public int fib(int n) {
        int fibo = 0;

        if (n <= 1)
            return n;
        else {
            fibo = fib(n - 2) + fib(n - 1);
        }
        return fibo;
    }

    public static void main(String[] args) {
        FibonacciRecursion obj = new FibonacciRecursion();
        System.out.println(obj.fib(7));
    }
}