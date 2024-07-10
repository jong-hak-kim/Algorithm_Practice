//HashSet으로 중복 찾기

//탈락하는 경우의 수
//1. 중복 // 그때의 위치값 % 인원수 => 탈락한 사람
//2. 마지막 문자로 시작하는 단어가 아닌 경우
//3. 한 글자인 단어인 경우

// 그때의 위치값 % 인원수 == 0이면 : 마지막 사람
    // 그떄의 위치값 / 인원수 ==> 말한 횟수
// 그 외
    // 그때의 위치값 / 인원수 + 1 ==> 말한 횟수

//답변 예시
//*탈락자 번호는 '인덱스 + 1'을 하면 구할 수 있다.
//*몇번 말하였는지 구할려면 '인덱스 / N + 1'을 하면 구할 수 있다.
//HashSet 사용
//처음에는 첫 번째 사람이 말하는 첫 번째 글자로 초기화 해놓기
//루프를 돌면서
    //이미 사용한 단어이거나 첫 글자가 이전 단어와 일치하지 않으면
        //탈락한 사람의 번호의 차례 반환

import java.util.HashSet;

class Solution {
    static int count = 0;
    static String beforeWord;
    
    public int[] solution(int n, String[] words) {
        HashSet<String> usedWords = new HashSet<>();
        
        char prevWord = words[0].charAt(0);
        
        for (int i = 0; i < words.length; i++){
            if(usedWords.contains(words[i]) || words[i].charAt(0) != prevWord) {
                return new int[] {(i % n) + 1, (i / n) + 1};
            }
            
            usedWords.add(words[i]);
            prevWord = words[i].charAt(words[i].length() - 1);
        }
        
        return new int[]{0, 0};

    }
}