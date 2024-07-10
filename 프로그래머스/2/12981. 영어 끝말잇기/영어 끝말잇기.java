//HashSet으로 중복 찾기

//탈락하는 경우의 수
//1. 중복 // 그때의 위치값 % 인원수 => 탈락한 사람
//2. 마지막 문자로 시작하는 단어가 아닌 경우
//3. 한 글자인 단어인 경우

// 그때의 위치값 % 인원수 == 0이면 : 마지막 사람
    // 그떄의 위치값 / 인원수 ==> 말한 횟수
// 그 외
    // 그때의 위치값 / 인원수 + 1 ==> 말한 횟수

import java.util.HashSet;

class Solution {
    static int count = 0;
    static boolean isDuplicate;
    static String beforeWord;
    
    public int[] solution(int n, String[] words) {
        HashSet<String> set = new HashSet<>();
        for(String word : words){
            count++;
            if(!set.isEmpty() && (set.contains(word) || 
               beforeWord.charAt(beforeWord.length() - 1) != word.charAt(0) ||
               word.length() == 1)){
                isDuplicate = true;
                break;
            }
            set.add(word);
            beforeWord = word;
        }
        
        if(!isDuplicate){
            return new int[]{0, 0};
        }
        
        int speaker = 0;
        int speakCount = 0;
        
        if(count % n == 0){
            speaker = n;
            speakCount = count / n;
        } else {
            speaker = count % n;
            speakCount = (count / n) + 1;
        }
        
        return new int[] {speaker, speakCount};
    }
}