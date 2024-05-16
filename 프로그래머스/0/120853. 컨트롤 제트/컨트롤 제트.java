import java.util.ArrayDeque;

class Solution {
    public int solution(String s) {
        String[] cmds = s.split(" ");
        ArrayDeque<String> stack = new ArrayDeque<>();
        
        for(String cmd : cmds){
            if(cmd.equals("Z")){
                stack.pop();
            } else {
                stack.push(cmd);
            }
            
        }
        
        
        int answer = 0;
        
        while(!stack.isEmpty()){
            int num = Integer.parseInt(stack.pop());
            answer += num;
        }
    
        return answer;
    }
}