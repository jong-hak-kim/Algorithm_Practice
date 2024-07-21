import java.util.ArrayDeque;

public class Solution {

    private static boolean[][] visited;
    private static int[] x = new int[]{-1, 1, 0, 0};
    private static int[] y = new int[]{0, 0, -1, 1};

    public int solution(int[][] maps) {
        int N = maps.length;
        int M = maps[0].length;
        visited = new boolean[N][M];
        return bfs(maps, 0, 0);
    }

    private static int bfs(int[][] maps, int startX, int startY) {
        int N = maps.length;
        int M = maps[0].length;
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{startX, startY, 1});

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int nowX = cur[0];
            int nowY = cur[1];
            int distance = cur[2];

            if (nowX == N - 1 && nowY == M - 1) {
                return distance;
            }

            for (int i = 0; i < 4; i++) {
                int dx = nowX + x[i];
                int dy = nowY + y[i];

                if (dx >= 0 && dy >= 0 && dx < N && dy < M && maps[dx][dy] == 1 && !visited[dx][dy]) {
                    queue.add(new int[]{dx, dy, distance + 1});
                    visited[dx][dy] = true;
                }
            }
        }

        return -1;
    }
}
