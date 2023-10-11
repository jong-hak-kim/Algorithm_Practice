import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < T; i++) {
            long num = Long.parseLong(bufferedReader.readLine());
            BigInteger bi = new BigInteger(String.valueOf(num));
            if (bi.isProbablePrime(100)) {
                stringBuilder.append(num).append("\n");
            } else {
                stringBuilder.append(bi.nextProbablePrime()).append("\n");
            }

        }
        System.out.println(stringBuilder);
    }
}