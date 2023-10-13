import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean[] prime;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        MakePrime();
        int T = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int count = 0;
            int N = Integer.parseInt(bufferedReader.readLine());
            for (int j = 0; j * 2 <= N; j++) {
                if (!prime[j] && !prime[N - j]) {
                    count++;
                }
            }
            stringBuilder.append(count).append("\n");
        }
        System.out.println(stringBuilder);
    }

    public static void MakePrime() {
        int maxNum = 1000001;
        prime = new boolean[maxNum];

        prime[0] = prime[1] = true;

        for (int i = 0; i <= Math.sqrt(maxNum); i++) {
            if (prime[i] == true) {
                continue;
            }

            for (int j = i * i; j < prime.length; j = j + i) {
                prime[j] = true;
            }
        }
    }
}