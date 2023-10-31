import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int M;
    private static int N;
    private static int[][] graph;
    private static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < T; i++) {

            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            M = Integer.parseInt(stringTokenizer.nextToken());
            N = Integer.parseInt(stringTokenizer.nextToken());
            int K = Integer.parseInt(stringTokenizer.nextToken());

            int temp = 0;
            graph = new int[M][N];
            visited = new boolean[M][N];

            for (int j = 0; j < K; j++) {
                stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                int X = Integer.parseInt(stringTokenizer.nextToken());
                int Y = Integer.parseInt(stringTokenizer.nextToken());
                graph[X][Y] = 1;
            }

            for (int k = 0; k < M; k++) {
                for (int l = 0; l < N; l++) {
                    if (graph[k][l] == 1 && !visited[k][l]) {
                        dfs(k, l);
                        temp++;
                    }
                }
            }
            stringBuilder.append(temp).append("\n");
        }
        System.out.println(stringBuilder);
    }

    public static void dfs(int startX, int startY) {
        visited[startX][startY] = true;

        int[] X = { 0, 0, -1, +1 };
        int[] Y = { -1, +1, 0, 0 };
        for (int i = 0; i < 4; i++) {
            int x = startX + X[i];
            int y = startY + Y[i];

            if (x < 0 || x >= M || y < 0 || y >= N) {
                continue;
            }

            if (graph[x][y] == 1 & !visited[x][y]) {
                dfs(x, y);
            }
        }
    }
}