import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    static char[][][] graph;
    static boolean[][][] visited;
    static int[][][] result;
    static int L, R, C;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            L = Integer.parseInt(stringTokenizer.nextToken());
            R = Integer.parseInt(stringTokenizer.nextToken());
            C = Integer.parseInt(stringTokenizer.nextToken());

            if (L == 0 && R == 0 && C == 0) {
                break;
            }
            graph = new char[L][R][C];
            visited = new boolean[L][R][C];
            result = new int[L][R][C];
            int[] start = new int[3];
            int[] end = new int[3];
            for (int i = 0; i < L; i++) {
                if (i != 0) {
                    bufferedReader.readLine();
                }
                for (int j = 0; j < R; j++) {
                    String input = bufferedReader.readLine();
                    for (int k = 0; k < C; k++) {
                        char word = input.charAt(k);
                        graph[i][j][k] = word;
                        if (input.charAt(k) == 'S') {
                            start[0] = i;
                            start[1] = j;
                            start[2] = k;
                        }
                        if (input.charAt(k) == 'E') {
                            end[0] = i;
                            end[1] = j;
                            end[2] = k;
                        }
                    }
                }

            }
            int[] resultArray = bfs(start[0], start[1], start[2]);
            int z = resultArray[0];
            int x = resultArray[1];
            int y = resultArray[2];
            if ((z < 0 || z >= L || x < 0 || x >= R || y < 0 || y >= C) || graph[z][x][y] != 'E') {
                stringBuilder.append("Trapped!").append("\n");
            } else {
                stringBuilder.append("Escaped in " + result[end[0]][end[1]][end[2]] + " minute(s).").append("\n");
            }

            bufferedReader.readLine();
        }

        System.out.println(stringBuilder);
    }

    public static int[] bfs(int startZ, int startX, int startY) {
        ArrayDeque<int[]> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(new int[] { startZ, startX, startY });
        int z = 0;
        int x = 0;
        int y = 0;
        visited[startZ][startX][startY] = true;
        while (!arrayDeque.isEmpty()) {
            int now[] = arrayDeque.poll();
            int nowZ = now[0];
            int nowX = now[1];
            int nowY = now[2];

            int[] Z = { -1, 1, 0, 0, 0, 0 };
            int[] X = { 0, 0, -1, 1, 0, 0 };
            int[] Y = { 0, 0, 0, 0, -1, 1 };
            for (int i = 0; i < 6; i++) {
                z = nowZ + Z[i];
                x = nowX + X[i];
                y = nowY + Y[i];
                if (z < 0 || z >= L || x < 0 || x >= R || y < 0 || y >= C) {
                    continue;
                }
                if (graph[z][x][y] != '#' && !visited[z][x][y]) {
                    arrayDeque.add(new int[] { z, x, y });
                    visited[z][x][y] = true;
                    result[z][x][y] = result[nowZ][nowX][nowY] + 1;
                }

                if (graph[z][x][y] == 'E') {
                    return new int[] { z, x, y };
                }
            }
        }
        return new int[] { z, x, y };
    }
}