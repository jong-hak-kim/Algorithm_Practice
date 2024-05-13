//1. 동일한 문자열 찾기
//2. 제거
//3. 붙이기
//4. 위 방식 반복
import java.util.ArrayDeque;

class Solution
{
    static char beforeWord;
    public int solution(String s)
    {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++){
            char currentWord = s.charAt(i);
            if(stack.isEmpty() || beforeWord != currentWord){
                stack.push(currentWord);
                beforeWord = currentWord;
            } else {
                stack.pop();
                if(stack.isEmpty()){
                    beforeWord = '0';
                    continue;
                } else{
                    beforeWord = stack.peek();
                }
            }
           
        }
        
        if(stack.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }
}