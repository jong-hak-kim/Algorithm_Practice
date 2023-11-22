import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer;
        while (true) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int A = Integer.parseInt(stringTokenizer.nextToken());
            int B = Integer.parseInt(stringTokenizer.nextToken());
            if (A == 0 && B == 0) {
                break;
            }
            if (A > B) {
                stringBuilder.append("Yes").append("\n");
            }
            if (A <= B) {
                stringBuilder.append("No").append("\n");
            }
        }

        System.out.println(stringBuilder);
    }
}