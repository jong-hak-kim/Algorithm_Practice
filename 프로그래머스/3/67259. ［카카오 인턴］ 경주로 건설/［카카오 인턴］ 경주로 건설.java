//BFS 사용
//시작점, 도착점 구하기
//직선도로 비용, 코너 비용 계산
import java.util.ArrayDeque;

class Solution {
    private static class Node {
        int x, y, direction, cost;
        public Node(int x, int y, int direction, int cost){
            this.x = x;
            this.y = y;
            this.direction = direction;
            this.cost = cost;
        }
    }
    private static int[] rx = {0, -1, 0, 1};
    private static int[] ry = {-1, 0, 1, 0};
    private static int N;
    private static int[][][] visited;
    
    private static boolean isValid(int x, int y){
        return 0 <= x && x < N && 0 <= y && y < N; 
    }
    
    private static boolean isBlocked(int[][] board, int x, int y){
        return !isValid(x, y) || board[x][y] == 1;
    }
    
    private static int calculateCost(int direction, int prevDirection, int cost) {
        if (prevDirection == -1 || (prevDirection - direction) % 2 == 0)
            return cost + 100;
        return cost + 600;
    }
    
    private static boolean isShouldUpdate(int x, int y, int direction, int newCost)     {
        return visited[x][y][direction] == 0 || visited[x][y][direction] > newCost;
    }

    public int solution(int[][] board) {
        N = board.length;
        ArrayDeque<Node> queue = new ArrayDeque<>();
        queue.add(new Node(0, 0, -1, 0));
        visited = new int[N][N][4];
        
        int answer = Integer.MAX_VALUE;
        
        while(!queue.isEmpty()){
            Node now = queue.poll();
            
            for(int i = 0; i < 4; i++){
                int dx = now.x + rx[i];
                int dy = now.y + ry[i];
                
                if(isBlocked(board, dx, dy)) {
                    continue;
                }
                
                int new_cost = calculateCost(i, now.direction, now.cost);
                
                if(dx == N - 1 && dy == N - 1){
                    answer = Math.min(answer, new_cost);
                }
                
                else if(isShouldUpdate(dx, dy, i, new_cost)){
                    queue.add(new Node(dx, dy, i, new_cost));
                    visited[dx][dy][i] = new_cost;
                }
            }
        }
        return answer;
    }
}