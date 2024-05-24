//작업기간 계산
//앞에 작업이 완료되면 배포
    //뒷 작업이 앞 작업기간보다 적게 소요된다면 함께 배포

import java.util.ArrayDeque;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayDeque<Integer> answer = new ArrayDeque<>();
        
        int n = progresses.length;
        
        int[] daysLeft = new int[n];
        
        for(int i = 0; i < n; i++){
            daysLeft[i] = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
        }
        
        int count = 0;
        
        int maxDay = daysLeft[0];
        
        for(int i = 0; i < n; i++){
            if(daysLeft[i] <= maxDay){
                count++;
            } else {
                answer.add(count);
                count = 1;
                maxDay = daysLeft[i];
            }
        }
        
        answer.add(count);
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
        
        
    }

}