import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] sangNum;
    static int[] num;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        sangNum = new int[N];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            sangNum[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int M = Integer.parseInt(bufferedReader.readLine());
        num = new int[M];
        int result = 0;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 0; i < M; i++) {
            num[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(sangNum);
        int low = 0;
        int last = N - 1;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < M; i++) {
            result = findNum(num[i], low, last);
            stringBuilder.append(result + " ");
        }

        System.out.println(stringBuilder);
    }

    public static int findNum(int num, int low, int high) {
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (num == sangNum[mid]) {
                return 1;
            } else if (num < sangNum[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return 0;
    }
}