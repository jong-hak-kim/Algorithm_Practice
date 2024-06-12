//현재 글자, 다음 글자, 현재 글자 색인 번호 출력, 사전 추가

//현재 글자
    //존재 유무 확인
        //존재할 경우
            //다음 글자와 합쳐서 존재 유무 확인
        //존재하지 않을 경우
            //색인번호 출력 후 사전에 단어 추가
//색인번호는 List에 저장해놓기

import java.util.*;

class Solution {
    public int[] solution(String msg) {
HashMap<String, Integer> dictionaryMap = new HashMap<>();
        int count = 1;

        // 'A'부터 'Z'까지 사전에 추가
        for (char c = 'A'; c <= 'Z'; c++) {
            dictionaryMap.put(String.valueOf(c), count++);
        }

        ArrayList<Integer> answer = new ArrayList<>();
        int i = 0;
        int msgLen = msg.length();

        // 메시지 순회
        while (i < msgLen) {
            String currentWord = "" + msg.charAt(i);
            int j = i;

            // 사전에 있는 가장 긴 단어 찾기
            while (j + 1 < msgLen && dictionaryMap.containsKey(currentWord + msg.charAt(j + 1))) {
                currentWord += msg.charAt(j + 1);
                j++;
            }

            // 사전에 있는 단어의 색인 번호를 결과에 추가
            answer.add(dictionaryMap.get(currentWord));

            // 새로운 단어 추가
            if (j + 1 < msgLen) {
                String newWord = currentWord + msg.charAt(j + 1);
                dictionaryMap.put(newWord, count++);
            }

            // 다음 위치로 이동
            i = j + 1;
        }

        // 결과 배열로 변환
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}