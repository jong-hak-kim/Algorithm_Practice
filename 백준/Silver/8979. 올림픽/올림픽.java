import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());
        int[][] arrays = new int[N][5];
        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < arrays[i].length; j++) {
                if (j == 4) {
                    arrays[i][4] = 1;
                    continue;
                }
                arrays[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }
        // 정렬
        Arrays.sort(arrays, (e1, e2) -> {
            if (e1[1] == e2[1]) {
                if (e1[2] == e2[2]) {
                    return e2[3] - e1[3];
                } else {
                    return e2[2] - e1[2];
                }

            } else {
                return e2[1] - e1[1];
            }
        });
        for (int i = 1; i < arrays.length; i++) {
            if (arrays[i][1] == arrays[i - 1][1] && arrays[i][2] == arrays[i - 1][2]
                    && arrays[i][3] == arrays[i - 1][3]) {
                arrays[i][4] = arrays[i - 1][4];
            } else {
                arrays[i][4] = i + 1;
            }
        }
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i][0] == K) {
                System.out.println(arrays[i][4]);
                break;
            }
        }
    }
}