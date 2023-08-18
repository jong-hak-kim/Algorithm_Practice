import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int min = 64;
    public static boolean[][] array;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        array = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String words = bufferedReader.readLine();
            for (int j = 0; j < M; j++) {
                if (words.charAt(j) == 'W') { // 문자가 W일 경우에 true
                    array[i][j] = true;
                } else {
                    array[i][j] = false; // 문자가 B일 경우에 false
                }
            }
        }

        // 경우의 수
        // N = 8 M = 8일 경우 (1,1)
        // N = 9 M = 9일 경우 (1,1) ~ (2,2)
        // N = 10 M = 10일 경우 (1,1) ~ (3,3)
        // ==> N - 7 , M - 7으로 경우의 수를 모두 탐색할 수 있다.
        int N_row = N - 7;
        int M_col = M - 7;

        for (int i = 0; i < N_row; i++) {
            for (int j = 0; j < M_col; j++) {
                find(i, j);
            }
        }
        System.out.println(min);

    }

    public static void find(int x, int y) {
        int count = 0;
        boolean TF = array[x][y];

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if (array[i][j] != TF) {
                    count++;
                }
                TF = !TF;
            }
            TF = !TF;
        }
        // 처음 문자를 W로 했을 때와 B로 했을 때를 비교하면서 최소인 경우의 값을 넣음
        count = Math.min(count, 64 - count);

        // 이전 최소값보다 더 작은 count가 나왔을 경우 그 값으로 변경
        min = Math.min(min, count);
    }
}