import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int[] array = new int[N];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(stringTokenizer.nextToken());
            array[i] = num;
        }
        int M = Integer.parseInt(bufferedReader.readLine());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        Arrays.sort(array);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(stringTokenizer.nextToken());
            int first = 0;
            int last = N - 1;
            while (first <= last) {
                int mid = (first + last) / 2;
                if (num > array[mid]) {
                    first = mid + 1;
                    continue;
                } else if (num < array[mid]) {
                    last = mid - 1;
                    continue;
                } else {
                    stringBuilder.append(1).append("\n");
                    break;
                }
            }
            if (first > last) {
                stringBuilder.append(0).append("\n");
            }
        }
        System.out.println(stringBuilder);
    }
}