import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int M = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] array = new int[M];
        for (int i = 0; i < M; i++) {
            int x = Integer.parseInt(stringTokenizer.nextToken());
            array[i] = x;
        }

        int max = array[0];
        if (M != 1) {

            for (int i = 1; i < array.length; i++) {
                if (((array[i] - array[i - 1]) % 2 == 0)) {
                    int num = (array[i] - array[i - 1]) / 2;
                    if (num > max) {
                        max = num;
                    }
                } else {
                    int num = (array[i] - array[i - 1]) / 2 + 1;
                    if (num > max) {
                        max = num;
                    }
                }
            }
        }
        if (N - array[M - 1] > max) {
            max = N - array[M - 1];
        }

        System.out.println(max);

    }
}