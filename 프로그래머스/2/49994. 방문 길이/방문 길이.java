// 좌표평면만큼의 배열 생성
// 입력받은 이동 분석
// 이동한 곳은 true
// 배열 넘어가거나 true일 경우 넘어가기
import java.util.HashSet;
class Solution {
    public int solution(String dirs) {
        boolean[][] space = new boolean[11][11];
        HashSet<String> answer = new HashSet<>();
        int startX = 5;
        int startY = 5;
        int count = 0;
        space[startX][startY] = true;
        int beforeX = 5;
        int beforeY = 5;
        int maxBoundary = 10;
                
        for(int i = 0; i < dirs.length(); i++){
            if(dirs.charAt(i) == 'U' && startX != 0){
                startX--;
            }
            if(dirs.charAt(i) == 'D' && startX != maxBoundary){
                startX++;
            }
            if(dirs.charAt(i) == 'R' && startY != maxBoundary){
                startY++;
            }
            if(dirs.charAt(i) == 'L' && startY != 0){
                startY--;
            }
            
            if(beforeX == startX && beforeY == startY){
                continue;
            }
            
            answer.add(beforeX + " " + beforeY + " "+ startX + " " + startY);
            answer.add(startX + " " + startY + " "+ beforeX + " " + beforeY);

            beforeX = startX;
            beforeY = startY;
        
        }
        
        return answer.size()/2;
        
    }
}