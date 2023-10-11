import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        long A = Integer.parseInt(stringTokenizer.nextToken());
        long B = Integer.parseInt(stringTokenizer.nextToken());
        long GCD = getGCD(A, B);
        System.out.println((A * B) / GCD);
    }

    public static long getGCD(long A, long B) {
        while (B != 0) {
            long result = A % B;
            A = B;
            B = result;
        }

        return A;
    }
}