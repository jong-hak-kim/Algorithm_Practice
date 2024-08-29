//높이 차 ==> 현재 칸 - 이동 칸 <= height
//높이차만큼 비용
import java.util.PriorityQueue;
class Solution {
    
    class Node {
        int i, j, cost;

        
        public Node(int i, int j, int cost){
            this.i = i;
            this.j = j;
            this.cost = cost;
        }
    }
    
    
    
    public int solution(int[][] land, int height) {
        int answer = 0;
        int[] X = {-1, 1, 0, 0};
        int[] Y = {0, 0, -1, 1};
        boolean[][] visited = new boolean[land.length][land.length];
        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> Integer.compare(o1.cost, o2.cost));
        pq.add(new Node(0,0,0));
        
        while(!pq.isEmpty()){
            Node now = pq.poll();
            if(visited[now.i][now.j]){
               continue; 
            }
            
            visited[now.i][now.j] = true;
            
            answer += now.cost;
            
            for(int i = 0; i < 4; i++){
                int dx = now.i + X[i];
                int dy = now.j + Y[i];
                
                if(!(dx >= 0 && dy >= 0 && dx < land.length && dy < land.length)){
                    continue;
                }
                
                int tempCost = Math.abs(land[now.i][now.j] - land[dx][dy]);
                int newCost = tempCost > height ? tempCost : 0;
                
                pq.add(new Node(dx, dy, newCost));
            }
        }
        return answer;
    }
}