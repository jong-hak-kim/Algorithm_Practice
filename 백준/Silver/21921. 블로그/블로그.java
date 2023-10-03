import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int X = Integer.parseInt(stringTokenizer.nextToken());
        int sum = 0;
        int count = 0;
        int max = 0;
        int maxCount = 1;
        int[] array = new int[N];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int i = 0; i < X; i++) {
            sum += array[i];
        }
        max = sum;
        count = 0;
        for (int i = X; i < array.length; i++) {
            sum += array[i] - array[i - X];
            if (max == sum) {
                maxCount++;
            } else if (max < sum) {
                max = sum;
                maxCount = 1;
            }

        }

        if (max == 0) {
            System.out.println("SAD");
            return;
        }
        System.out.println(max);
        System.out.println(maxCount);

    }
}