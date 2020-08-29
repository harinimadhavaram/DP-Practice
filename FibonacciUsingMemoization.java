
//Fibonacci Using Memoization
//Memoization = Top Down Approach.
import java.util.*;

public class FibonacciUsingMemoization {
    HashMap<Integer, Integer> map = new HashMap<>();

    public int fib(int n) {
        if (n <= 1)
            return n;
        else if (!map.containsKey(n)) {
            map.put(n, fib(n - 1) + fib(n - 2));
        }
        return map.get(n);
    }

    public static void main(String[] args) {
        FibonacciUsingMemoization obj = new FibonacciUsingMemoization();
        int n = 5;
        System.out.println("Fibonaci number of " + n + " = " + obj.fib(5));
    }

}