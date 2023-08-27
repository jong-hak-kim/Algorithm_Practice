import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        int N = Integer.parseInt(bufferedReader.readLine());
        int[][] array = new int[N][2];
        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            array[i][0] = Integer.parseInt(stringTokenizer.nextToken());
            array[i][1] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Arrays.sort(array, (e1, e2) -> {
            if (e1[1] == e2[1]) {
                return e1[0] - e2[0];
            } else {
                return e1[1] - e2[1];
            }
        });
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i][0] + " " + array[i][1]).append("\n");
        }
        System.out.println(stringBuilder);
    }
}