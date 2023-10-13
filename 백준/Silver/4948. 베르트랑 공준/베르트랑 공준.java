import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean[] prime;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        MakePrime();
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            int count = 0;
            int number = Integer.parseInt(bufferedReader.readLine());
            if (number == 0) {
                break;
            }

            for (int i = number + 1; i <= (number * 2); i++) {
                if (prime[i]) {
                    continue;
                }
                if (!prime[i]) {
                    count++;
                }
            }
            stringBuilder.append(count).append("\n");
        }
        System.out.println(stringBuilder);
    }

    public static void MakePrime() {
        int num = 246913;
        prime = new boolean[num];

        prime[0] = prime[1] = true;

        for (int i = 0; i <= Math.sqrt(num); i++) {
            if (prime[i] == true) {
                continue;
            }

            for (int j = i * i; j < prime.length; j = j + i) {
                prime[j] = true;
            }
        }
    }
}