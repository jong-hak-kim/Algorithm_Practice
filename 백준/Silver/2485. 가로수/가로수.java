import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }

        int gcd = 0;
        for (int i = 0; i < N - 1; i++) {
            int distance = array[i + 1] - array[i];
            gcd = getGCD(gcd, distance);
        }

        System.out.println((array[N - 1] - array[0]) / gcd + 1 - N);
    }

    public static int getGCD(int A, int B) {
        while (B != 0) {
            int result = A % B;
            A = B;
            B = result;
        }
        return A;
    }
}