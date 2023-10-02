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
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(array);
        long allMax = Integer.parseInt(bufferedReader.readLine());
        long left = 0;
        long right = array[N - 1];
        long answer = 0;

        while (left <= right) {
            long mid = (left + right) / 2;
            long sum = 0;
            for (int money : array) {
                if (money >= mid)
                    sum += mid;
                else
                    sum += money;
            }
            if (sum > allMax) {
                right = mid - 1;
            } else {
                left = mid + 1;
                answer = Math.max(answer, mid);
            }
        }

        System.out.println(answer);
    }
}