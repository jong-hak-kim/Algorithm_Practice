import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static boolean[] prime;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        MakePrimeArray(N);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = M; i <= N; i++) {
            if (prime[i]) {
                continue;
            }
            if (!prime[i]) {
                stringBuilder.append(i).append("\n");
            }
        }
        System.out.println(stringBuilder);
    }

    public static void MakePrimeArray(int N) {
        prime = new boolean[N + 1];

        if (N < 2) {
            return;
        }

        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (prime[i] == true) {
                continue;
            }

            for (int j = i * i; j < prime.length; j = j + i) {
                prime[j] = true;
            }
        }
    }
}