import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static int M;
    static int N;
    static int[][] space;
    static boolean[][] visited;
    static int innerCount;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        M = Integer.parseInt(stringTokenizer.nextToken());
        N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());
        List<Integer> area = new ArrayList<>();

        space = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < K; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int leftX = Integer.parseInt(stringTokenizer.nextToken());
            int leftY = Integer.parseInt(stringTokenizer.nextToken());
            int rightX = Integer.parseInt(stringTokenizer.nextToken());
            int rightY = Integer.parseInt(stringTokenizer.nextToken());
            for (int j = leftX; j < rightX; j++) {
                for (int k = leftY; k < rightY; k++) {
                    if (space[j][k] == 1) {
                        continue;
                    }
                    space[j][k] = 1;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (space[i][j] != 1 && !visited[i][j]) {
                    innerCount = 0;
                    count++;
                    dfs(i, j);
                    area.add(innerCount);
                }
            }
        }
        Collections.sort(area);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(count).append("\n");
        for (int i = 0; i < area.size(); i++) {
            stringBuilder.append(area.get(i)).append(" ");
        }

        System.out.println(stringBuilder);

    }

    public static void dfs(int startX, int startY) {
        innerCount++;
        visited[startX][startY] = true;
        for (int i = 0; i < 4; i++) {
            int[] X = { 0, 0, -1, 1 };
            int[] Y = { -1, 1, 0, 0 };
            int x = startX + X[i];
            int y = startY + Y[i];
            if (x < 0 || x >= N || y < 0 || y >= M) {
                continue;
            }
            if (space[x][y] != 1 && !visited[x][y]) {
                dfs(x, y);
            }
        }
    }
}