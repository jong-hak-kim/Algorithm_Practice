import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        int n = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int H = Integer.parseInt(stringTokenizer.nextToken());
            stringTokenizer.nextToken();
            int N = Integer.parseInt(stringTokenizer.nextToken());
            int count = 1;
            int floor = N % H;
            int ho = N / H;
            if (floor == 0) {
                stringBuilder.append((H * 100) + ho).append("\n");
            } else {
                int room = count + (floor * 100) + ho;
                stringBuilder.append(room).append("\n");
            }
        }
        System.out.println(stringBuilder);
    }
}