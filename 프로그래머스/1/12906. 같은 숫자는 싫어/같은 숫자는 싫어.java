import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        
        for(int i = 0; i < arr.length; i++){
            if(stack.isEmpty() || stack.peek() != arr[i]){
                stack.push(arr[i]);
            }
        }
        
        int[] result = new int[stack.size()];
        for(int j = stack.size() - 1; j >= 0; j--){
            result[j] = stack.pop();
        }
        
        return result;
    }
}