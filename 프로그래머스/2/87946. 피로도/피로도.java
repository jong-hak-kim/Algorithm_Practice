//최소 필요 피로도에 충족하는지 여부

class Solution {

    private static int result;
    private static int[][] Dungeons;
    private static boolean[] visited;
   
    private static void explore(int now, int count) {
        for(int i = 0; i < Dungeons.length; i++){
           if(!visited[i] && now >= Dungeons[i][0]){
               visited[i] = true;
               
               explore(now - Dungeons[i][1], count + 1);
               result = Math.max(result, count + 1);
               visited[i] = false;
           }
        }
    }
    
    public int solution(int k, int[][] dungeons) {
        result = 0;
        Dungeons = dungeons;
        
        visited = new boolean[dungeons.length];
        
        explore(k, 0);
            
        return result;
    }
}