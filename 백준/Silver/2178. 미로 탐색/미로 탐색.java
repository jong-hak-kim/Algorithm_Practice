import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[][] graph;
    static boolean[][] visited;
    static int[][] result;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());
        graph = new int[N + 1][M + 1];
        visited = new boolean[N + 1][M + 1];
        result = new int[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            String input = bufferedReader.readLine();
            for (int j = 1; j <= M; j++) {
                graph[i][j] = input.charAt(j - 1) - '0';
            }
        }
        bfs(1, 1);

        System.out.println(result[N][M] + 1);
    }

    public static void bfs(int startX, int startY) {
        ArrayDeque<int[]> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(new int[] { startX, startY });
        visited[startX][startY] = true;
        while (!arrayDeque.isEmpty()) {
            int now[] = arrayDeque.poll();
            int nowX = now[0];
            int nowY = now[1];
            int[] X = { 0, 0, -1, 1 };
            int[] Y = { -1, 1, 0, 0 };
            for (int index = 0; index < 4; index++) {
                int x = nowX + X[index];
                int y = nowY + Y[index];
                if (x <= 0 || x >= N + 1 || y <= 0 || y >= M + 1) {
                    continue;
                }
                if (graph[x][y] == 1 && !visited[x][y]) {
                    arrayDeque.add(new int[] { x, y });
                    visited[x][y] = true;
                    result[x][y] = result[nowX][nowY] + 1;
                }
            }
        }
    }
}