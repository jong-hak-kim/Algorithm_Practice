import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static char[][] graph;
    public static boolean[][] visited;
    public static int N;
    public static int count = 0;
    public static int blindCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bufferedReader.readLine());
        graph = new char[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String input = bufferedReader.readLine();
            for (int j = 0; j < N; j++) {
                graph[i][j] = input.charAt(j);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    count++;
                    dfs(i, j, graph[i][j]);
                }
            }
        }
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (graph[i][j] == 'G') {
                    graph[i][j] = 'R';
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    blindCount++;
                    dfs(i, j, graph[i][j]);
                }
            }
        }

        System.out.println(count + " " + blindCount);
    }

    public static void dfs(int startX, int startY, char color) {
        visited[startX][startY] = true;
        int[] X = { 0, 0, -1, 1 };
        int[] Y = { -1, 1, 0, 0 };
        for (int i = 0; i < 4; i++) {
            int x = startX + X[i];
            int y = startY + Y[i];
            if (x < 0 || x >= N || y < 0 || y >= N) {
                continue;
            }
            if (graph[x][y] == color && !visited[x][y]) {
                dfs(x, y, color);
            }
        }
    }
}