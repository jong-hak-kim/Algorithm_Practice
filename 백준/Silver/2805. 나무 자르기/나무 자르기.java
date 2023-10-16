import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] treeHeight;
    static int N;
    static int M;
    static int start, end = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());
        treeHeight = new int[N];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            treeHeight[i] = Integer.parseInt(stringTokenizer.nextToken());
            if (end < treeHeight[i]) {
                end = treeHeight[i];
            }
        }

        parametricSearch(start, end);

    }

    public static void parametricSearch(int start, int end) {
        while (start < end) {
            int mid = (start + end) / 2;
            long sum = 0;
            for (int i = 0; i < N; i++) {
                if (treeHeight[i] - mid > 0) {
                    sum += (treeHeight[i] - mid);
                }
            }
            if (sum < M) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(start - 1);
    }
}