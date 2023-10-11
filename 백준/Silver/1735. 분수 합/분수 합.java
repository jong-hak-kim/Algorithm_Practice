import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int A = Integer.parseInt(stringTokenizer.nextToken());
        int B = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int C = Integer.parseInt(stringTokenizer.nextToken());
        int D = Integer.parseInt(stringTokenizer.nextToken());
        int numerator = (A * D) + (B * C);
        int denominator = B * D;
        int mod = getGCD(numerator, denominator);
        numerator /= mod;
        denominator /= mod;
        System.out.println(numerator + " " + denominator);
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