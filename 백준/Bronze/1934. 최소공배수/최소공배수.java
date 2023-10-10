import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < T; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int A = Integer.parseInt(stringTokenizer.nextToken());
            int B = Integer.parseInt(stringTokenizer.nextToken());
            stringBuilder.append((A * B) / getGCD(A, B)).append("\n");
        }
        System.out.println(stringBuilder);
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