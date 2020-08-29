
public class FibonaciIterative {
    public int fib(int n) {
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int result = a + b;
            a = b;
            b = result;

        }
        return b;
    }

    public static void main(String[] args) {
        FibonaciIterative obj = new FibonaciIterative();
        System.out.println(obj.fib(7));
    }
}