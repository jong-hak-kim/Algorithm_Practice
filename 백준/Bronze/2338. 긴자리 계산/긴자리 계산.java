import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        BigInteger bigA = new BigInteger(bufferedReader.readLine());
        BigInteger bigB = new BigInteger(bufferedReader.readLine());

        stringBuilder.append(bigA.add(bigB)).append("\n");
        stringBuilder.append(bigA.subtract(bigB)).append("\n");
        stringBuilder.append(bigA.multiply(bigB)).append("\n");
        System.out.println(stringBuilder);
    }
}