import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static char[][] graph;
    static boolean[][][] visited;
    static int[] X = { 0, 0, -1, 1 };
    static int[] Y = { -1, 1, 0, 0 };

    static class info {
        int x, y, count;
        boolean breakWall;

        public info(int x, int y, int count, boolean breakWall) {
            this.x = x;
            this.y = y;
            this.count = count;
            this.breakWall = breakWall;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());
        graph = new char[N][M];
        visited = new boolean[N][M][2];
        for (int i = 0; i < N; i++) {
            String input = bufferedReader.readLine();
            for (int j = 0; j < M; j++) {
                graph[i][j] = input.charAt(j);
            }
        }

        System.out.println(bfs());
    }

    public static int bfs() {
        Queue<info> move = new ArrayDeque<>();
        move.add(new info(0, 0, 1, false));
        visited[0][0][0] = true;
        while (!move.isEmpty()) {
            info now = move.poll();
            if (now.x == N - 1 && now.y == M - 1) {
                return now.count;
            }
            for (int i = 0; i < 4; i++) {
                int nowX = now.x + X[i];
                int nowY = now.y + Y[i];
                int breakWallIndex = 0;
                if (now.breakWall) {
                    breakWallIndex = 1;
                }
                if (!now.breakWall) {
                    breakWallIndex = 0;
                }

                if (!range(nowX, nowY)) {
                    continue;
                }

                if (visited[nowX][nowY][breakWallIndex]) {
                    continue;
                }

                if (graph[nowX][nowY] == '0') {
                    if (!now.breakWall) {
                        move.add(new info(nowX, nowY, now.count + 1, false));
                        visited[nowX][nowY][0] = true;
                    } else if (now.breakWall) {
                        move.add(new info(nowX, nowY, now.count + 1, true));
                        visited[nowX][nowY][1] = true;
                    }
                } else if (graph[nowX][nowY] == '1' && !now.breakWall) {
                    move.add(new info(nowX, nowY, now.count + 1, true));
                    visited[nowX][nowY][1] = true;
                }
            }
        }
        return -1;
    }

    public static boolean range(int x, int y) {
        return x >= 0 && y >= 0 && x < N && y < M;
    }
}