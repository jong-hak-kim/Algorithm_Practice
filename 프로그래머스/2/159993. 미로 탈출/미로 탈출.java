//BFS 사용
//레버 찾기
//도착점 찾기

import java.util.ArrayDeque;

class Solution {

    private static boolean[][] visited;
    private static int[] S;
    private static int[] L;
    private static int[] E;
    private static int[] x = {-1, 1, 0, 0};
    private static int[] y = {0, 0, -1, 1};

    public int solution(String[] maps) {
        int N = maps.length;
        int M = maps[0].length();
        S = new int[2];
        L = new int[2];
        E = new int[2];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (maps[i].charAt(j) == 'S') {
                    S[0] = i;
                    S[1] = j;
                }

                if (maps[i].charAt(j) == 'L') {
                    L[0] = i;
                    L[1] = j;
                }
                if (maps[i].charAt(j) == 'E') {
                    E[0] = i;
                    E[1] = j;
                }
            }
        }
        int lTime = bfs(maps, S, L);
        if (lTime == -1) return -1;
        int eTime = bfs(maps, L, E);
        if (eTime == -1) return -1;

        return lTime + eTime;
    }

    private static int bfs(String[] maps, int[] S, int[] dest) {
        int N = maps.length;
        int M = maps[0].length();
        visited = new boolean[N][M];
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{S[0], S[1], 0});
        visited[S[0]][S[1]] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int nowX = cur[0];
            int nowY = cur[1];
            int time = cur[2];

            if (nowX == dest[0] && nowY == dest[1]) {
                return time;
            }

            for (int i = 0; i < 4; i++) {
                int dx = nowX + x[i];
                int dy = nowY + y[i];

                if (dx >= 0 && dy >= 0 && dx < N && dy < M && maps[dx].charAt(dy) != 'X' && !visited[dx][dy]) {
                    queue.add(new int[]{dx, dy, time + 1});
                    visited[dx][dy] = true;
                }
            }


        }
        return -1;
    }

}
