class Solution {
    private static boolean[] visited;
    private static int[][] computers;
    private static int result;
    public int solution(int n, int[][] computers) {
        visited = new boolean[n];
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                dfs(i, computers);
                result++;
            }
        }
        
        return result;
    }
    
    private static void dfs(int now , int[][] computers){
        visited[now] = true;
        for(int i = 0; i < computers[now].length; i++){
            if(!visited[i] && computers[now][i] == 1){
                dfs(i, computers);
            }
        }
    }
}