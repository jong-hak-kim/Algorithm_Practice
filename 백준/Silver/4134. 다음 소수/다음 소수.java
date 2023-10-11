import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < T; i++) {
            long num = Long.parseLong(bufferedReader.readLine());
            while (true) {
                if (!CheckPrime(num)) {
                    num++;
                }
                if (CheckPrime(num)) {
                    stringBuilder.append(num).append("\n");
                    break;
                }
            }
        }
        System.out.println(stringBuilder);
    }

    public static boolean CheckPrime(long num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}