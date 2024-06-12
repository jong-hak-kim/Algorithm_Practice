//의상 종류별 경우의 수
// 의상 개수 + 아예 안입을 경우의 수(1)

//의상 종류가 1개인 경우
    //모든 조합 개수 == 의상 개수
//그 이상
    //모든 조합 개수 == 각 의상종류별 경우의 수를 서로 곱하기 - 모든 의상을 아예 안입을 경우의 수(1)

//얼굴 3개 / 상의 2개 / 하의 1개 = 23개
//얼굴 3개 / 상의 2개 / 하의 2개 = 35개

//해쉬맵 <의상 종류 / 개수>
import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> clothesMap = new HashMap<>();
        for(String[] clothesKind : clothes){
            String kind = clothesKind[1];
            clothesMap.put(kind, clothesMap.getOrDefault(kind, 0) + 1);
        }
        
        ArrayList<String> keySet = new ArrayList<>(clothesMap.keySet());

        int combination = 1;        
        
        if(keySet.size() == 1){
            for(String key: keySet){
                return clothesMap.get(key);
            }
        }
        
        for(String key : keySet){
            int count = clothesMap.get(key) + 1;
            combination *= count;
        }
        
        return combination - 1;
    }
}