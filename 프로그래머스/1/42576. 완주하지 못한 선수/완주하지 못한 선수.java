//HashMap에 참여 선수 이름과 인원 추가
// 키 = 선수 이름, 값 = 인원 수
// 완주한 선수 이름 배열 크기만큼 반복하여 제거
    // 해쉬맵의 값이 1보다 작아질 경우
    // 버킷 제거

import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
       HashMap<String, Integer> players = new HashMap<>();
        for (String player : participant) {
            players.put(player, players.getOrDefault(player, 0) + 1);
        }


        for (String complete : completion) {
            players.put(complete, players.get(complete) - 1);
        }
        
        for (String leftPlayer : players.keySet()){
            if(players.get(leftPlayer) != 0){
                answer = leftPlayer;
            }
        }
        return answer;
        
    }
}