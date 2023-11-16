import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int m;
    static int x, y;
    static ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
    static int graph[][];
    static boolean[] visited;
    static int count = 0;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        m = Integer.parseInt(bufferedReader.readLine());
        graph = new int[n + 1][n + 1];
        visited = new boolean[n + 1];
        dist = new int[n + 1];
        for (int i = 0; i < m; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            x = Integer.parseInt(stringTokenizer.nextToken());
            y = Integer.parseInt(stringTokenizer.nextToken());
            graph[x][y] = graph[y][x] = 1;
        }

        bfs(a, b);
        if (dist[b] == 0) {
            System.out.println(-1);
        }
        if (dist[b] != 0) {
            System.out.println(dist[b]);
        }

    }

    public static void bfs(int start, int end) {
        visited[start] = true;
        arrayDeque.offer(start);

        while (!arrayDeque.isEmpty()) {
            start = arrayDeque.poll();
            if (start == end) {
                break;
            }
            for (int i = 1; i <= n; i++) {
                if (graph[start][i] == 1 && !visited[i]) {
                    arrayDeque.offer(i);
                    visited[i] = true;
                    dist[i] = dist[start] + 1;
                }
            }
            count++;

        }
    }
}