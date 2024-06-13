//수익금 10퍼 다단계
import java.util.HashMap;



class Solution {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        HashMap<String, String> recommend = new HashMap<>();
        for(int i = 0; i < enroll.length; i++){
            recommend.put(enroll[i], referral[i]);
        }
        
       
        
        HashMap<String, Integer> moneyMap = new HashMap<>();
        for(int i = 0; i < seller.length; i++) {
            String currentName = seller[i];
            int money = amount[i] * 100;
            while(money > 0 && !currentName.equals("-")){
                moneyMap.put(currentName, moneyMap.getOrDefault(currentName, 0) + money - (money / 10));
                currentName = recommend.get(currentName);
                
                money /= 10;
            }
        }
        
         int answer[] = new int[enroll.length];
        
        for(int i = 0; i < enroll.length; i++){
            answer[i] = moneyMap.getOrDefault(enroll[i], 0);
        }
         return answer;
    }
}