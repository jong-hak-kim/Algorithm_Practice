import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[][] graph;
    public static boolean[][] visited;
    public static int N;
    public static int M;
    public static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());
        graph = new int[N + 1][M + 1];
        visited = new boolean[N + 1][M + 1];
        for (int i = 0; i < K; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int r = Integer.parseInt(stringTokenizer.nextToken());
            int c = Integer.parseInt(stringTokenizer.nextToken());
            graph[r][c] = 1;
        }

        int max = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (graph[i][j] == 1 && !visited[i][j]) {
                    count = 0;
                    dfs(i, j);
                    if (max < count) {
                        max = count;
                    }
                }
            }
        }
        System.out.println(max);
    }

    public static void dfs(int startX, int startY) {
        count++;
        visited[startX][startY] = true;
        int[] X = { -1, 1, 0, 0 };
        int[] Y = { 0, 0, -1, 1 };

        for (int i = 0; i < 4; i++) {
            int x = startX + X[i];
            int y = startY + Y[i];
            if (x < 1 || x >= N + 1 || y < 1 || y >= M + 1) {
                continue;
            }

            if (graph[x][y] == 1 && !visited[x][y]) {
                dfs(x, y);
            }
        }
    }
}