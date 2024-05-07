//문자열의 개수 미만으로 회전
//스택으로 올바른 괄호 문자열인지 확인
// 올바른 괄호 문자열일 경우 카운트 1 증가
import java.util.ArrayDeque;
import java.util.HashMap;

class Solution {
    public int solution(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        
        int count = 0;
        int size = s.length();
        s += s;
        
        A:for(int i = 0; i < size; i++){
            ArrayDeque<Character> stack = new ArrayDeque<>();
            
            for(int j = i; j < i + size; j++){
                char c = s.charAt(j);
                
                if(!map.containsKey(c)){
                    stack.push(c);
                }
                
                else if(stack.isEmpty() || !stack.pop().equals(map.get(c))){
                    continue A;
                }
            }
    
            
            if(stack.isEmpty()){
                count++;
            }
            
        }
        return count;
    }
}