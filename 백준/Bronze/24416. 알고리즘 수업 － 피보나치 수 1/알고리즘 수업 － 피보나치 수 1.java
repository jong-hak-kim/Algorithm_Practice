import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] fibo;
    static int countA = 0;
    static int countB = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        fibo = new int[n];
        fib(n);
        fibonacci(n);
        System.out.println(countA + " " + countB);
    }

    public static int fib(int n) {
        if (n == 1 || n == 2) {
            countA++;
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static int fibonacci(int n) {
        fibo[0] = 1;
        fibo[1] = 1;
        for (int i = 2; i < n; i++) {
            countB++;
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        return fibo[n - 1];
    }
}