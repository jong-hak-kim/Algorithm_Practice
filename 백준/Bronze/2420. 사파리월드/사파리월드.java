import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        long N = Integer.parseInt(stringTokenizer.nextToken());
        long M = Integer.parseInt(stringTokenizer.nextToken());
        long result = N - M;
        if (result < 0) {
            result = (N - M) * -1;
        }
        System.out.println(result);
    }
}