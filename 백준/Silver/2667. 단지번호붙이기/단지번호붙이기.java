import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static char[][] complex;
    static boolean[][] visited;
    static int complexCount = 0;
    static int homeCount = 0;
    static int N = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        List<Integer> result = new ArrayList<>();
        complex = new char[N][N];
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            String num = bufferedReader.readLine();
            for (int j = 0; j < N; j++) {
                complex[i][j] = num.charAt(j);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (complex[i][j] == '1' && !visited[i][j]) {
                    homeCount = 0;
                    complexCount++;
                    dfs(i, j);
                    result.add(homeCount);
                }
            }
        }
        Collections.sort(result);
        for (int i = 0; i < result.size(); i++) {
            stringBuilder.append(result.get(i)).append("\n");
        }
        System.out.println(complexCount);
        System.out.println(stringBuilder);
    }

    public static void dfs(int startX, int startY) {
        homeCount++;
        visited[startX][startY] = true;
        int[] X = { 0, 0, -1, 1 };
        int[] Y = { -1, 1, 0, 0 };
        for (int i = 0; i < 4; i++) {
            int x = startX + X[i];
            int y = startY + Y[i];
            if (x < 0 || x >= N || y < 0 || y >= N) {
                continue;
            }
            if (complex[x][y] == '1' && !visited[x][y]) {
                dfs(x, y);
            }

        }
    }

}