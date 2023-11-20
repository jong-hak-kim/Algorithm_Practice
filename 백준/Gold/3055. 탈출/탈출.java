import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    static int R, C;
    static char[][] graph;
    static ArrayDeque<info> hedgehog;
    static ArrayDeque<info> water;
    static int result;
    static int[] X = { 0, 0, -1, 1 };
    static int[] Y = { -1, 1, 0, 0 };

    static class info {
        int x, y, count;

        public info(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        R = Integer.parseInt(stringTokenizer.nextToken());
        C = Integer.parseInt(stringTokenizer.nextToken());
        graph = new char[R][C];
        hedgehog = new ArrayDeque<>();
        water = new ArrayDeque<>();
        result = 0;
        for (int i = 0; i < R; i++) {
            String input = bufferedReader.readLine();
            for (int j = 0; j < C; j++) {
                graph[i][j] = input.charAt(j);
                if (graph[i][j] == 'S') {
                    hedgehog.add(new info(i, j, 0));
                }
                if (graph[i][j] == '*') {
                    water.add(new info(i, j, 0));
                }
            }
        }

        bfs();
        StringBuilder stringBuilder = new StringBuilder();
        if (result == 0) {
            stringBuilder.append("KAKTUS").append("\n");
        }
        if (result != 0) {
            stringBuilder.append(result).append("\n");
        }
        System.out.println(stringBuilder);
    }

    public static void bfs() {
        while (!hedgehog.isEmpty()) {
            int size = water.size();
            for (int i = 0; i < size; i++) {
                info now = water.poll();
                for (int j = 0; j < 4; j++) {
                    int x = now.x + X[j];
                    int y = now.y + Y[j];
                    if (range(x, y) && (graph[x][y] == 'S' || graph[x][y] == '.')) {
                        graph[x][y] = '*';
                        water.add(new info(x, y, 0));
                    }
                }
            }

            size = hedgehog.size();
            for (int i = 0; i < size; i++) {
                info now = hedgehog.poll();
                for (int j = 0; j < 4; j++) {

                    int x = now.x + X[j];
                    int y = now.y + Y[j];
                    if (!range(x, y)) {
                        continue;
                    }
                    if (graph[x][y] == 'D') {
                        result = now.count + 1;
                        return;
                    }
                    if (range(x, y) && (graph[x][y] == '.' || graph[x][y] == 'D')) {
                        graph[x][y] = 'S';
                        hedgehog.add(new info(x, y, now.count + 1));
                    }

                }
            }

        }
    }

    public static boolean range(int x, int y) {
        return x >= 0 && y >= 0 && x < R && y < C;
    }
}