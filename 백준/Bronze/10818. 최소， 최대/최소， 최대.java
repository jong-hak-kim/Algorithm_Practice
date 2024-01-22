import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int num = Integer.parseInt(stringTokenizer.nextToken());
        int max = num;
        int min = num;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < N; i++) {
            num = Integer.parseInt(stringTokenizer.nextToken());
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        stringBuilder.append(min + " " + max);
        System.out.println(stringBuilder.toString());
    }
}