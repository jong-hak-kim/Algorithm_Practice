import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static int[][] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());
        graph = new int[N + 1][N + 1];
        visited = new boolean[N + 1];
        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            graph[a][b] = graph[b][a] = 1;
        }

        int result = 0;

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(i);
                result++;
            }
        }

        System.out.println(result);
    }

    public static void dfs(int index) {
        if (visited[index]) {
            return;
        }
        visited[index] = true;
        for (int i = 1; i <= N; i++) {
            if (graph[index][i] == 1) {
                dfs(i);
            }
        }
    }
}