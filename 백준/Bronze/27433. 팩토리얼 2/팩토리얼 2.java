import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        System.out.println(getFactorial(N));
    }

    public static long getFactorial(int N) {
        if (N <= 1) {
            return 1;
        }
        return N * getFactorial(N - 1);
    }
}