import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] lanLength;
    static long min, max = 0;
    static int K, N = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        K = Integer.parseInt(stringTokenizer.nextToken());
        N = Integer.parseInt(stringTokenizer.nextToken());
        lanLength = new int[K];
        for (int i = 0; i < K; i++) {
            lanLength[i] = Integer.parseInt(bufferedReader.readLine());
            if (max < lanLength[i]) {
                max = lanLength[i];
            }
        }
        max++;
        getMaxLength();
    }

    public static void getMaxLength() {
        while (min < max) {
            long mid = (min + max) / 2;
            long sum = 0;
            for (int i = 0; i < lanLength.length; i++) {
                sum += (lanLength[i] / mid);
            }
            if (sum < N) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        System.out.println(min - 1);
    }
}