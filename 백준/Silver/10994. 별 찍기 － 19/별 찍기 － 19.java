import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static char[][] stars;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //1, 5, 9, 13
        // 4n - 3
        // (2,2) (4,4) (6,6)
        int N = Integer.parseInt(bufferedReader.readLine());
        stars = new char[(4 * N) - 3][(4 * N) - 3];

        int centerX = 2 * (N - 1);
        int centerY = 2 * (N - 1);
        int length = (4 * N) - 3;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                stars[i][j] = ' ';
            }
        }
        stars[centerX][centerY] = '*';
        makeStar(0, length);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                stringBuilder.append(stars[i][j]);
            }
            stringBuilder.append("\n");
        }

        System.out.println(stringBuilder.toString());
    }

    static void makeStar(int start, int length) {
        if (length <= start) return;
        for (int i = start; i < length; i++) {
            stars[i][length - 1] = '*';
            stars[start][i] = '*';
            stars[i][start] = '*';
            stars[length - 1][i] = '*';
        }

        makeStar(start + 2, length - 2);

    }
}