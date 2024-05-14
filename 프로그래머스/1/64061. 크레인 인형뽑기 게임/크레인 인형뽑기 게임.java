// moves 크기만큼 반복
// moves에 있는 순서로 차례대로 담기
    // peek을 이용해서 같은 인형일 경우 pop
import java.util.ArrayDeque;

class Solution {
    public int solution(int[][] board, int[] moves) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int result = 0;
        
        
        for(int i = 0; i < moves.length; i++){
            int move = moves[i] - 1;
            for(int j = 0; j < board.length; j++){
                if(board[j][move] != 0){
                    if(!stack.isEmpty() && stack.peek() == board[j][move]){
                        stack.pop();
                        board[j][move] = 0;
                        result += 2;
                        break;
                    }
                        stack.push(board[j][move]);
                        board[j][move] = 0;
                        break;
                    }

                }
            }
                return result;
    }
}   