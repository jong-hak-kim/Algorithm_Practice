//해쉬맵<원하는 코스요리 수,개수에 맞게 손님이 주문한 코스요리 수 해쉬맵>
//원하는 코스요리의 수만 먼저 집어넣은 뒤

//코스 요리의 모든 조합을 구한다. (오름차순으로 정렬 먼저 진행)
    //원하는 코스 요리의 수와 같은 조합만 넣는다

//각 개수별 만들어진 조합에서 빈도수가 많은 조합을 찾는다.
//손님이 2명 이상 주문한 경우를 찾는다.
//오름차순 정렬

import java.util.*;

public class Solution {
    private static HashMap<Integer, HashMap<String, Integer>> courseMap;

    public static String[] solution(String[] orders, int[] course) {
        courseMap = new HashMap<>();
        for (int i : course) {
            courseMap.put(i, new HashMap<>());
        }

        for (String order : orders) {
            char[] orderArray = order.toCharArray();
            Arrays.sort(orderArray);
            combinations(0, orderArray, "");
        }

        ArrayList<String> answer = new ArrayList<>();

        for (HashMap<String, Integer> count : courseMap.values()) {
            count.values()
                    .stream()
                    .max(Comparator.comparingInt(o -> o))
                    .ifPresent(cnt -> count.entrySet()
                            .stream()
                            .filter(entry -> cnt.equals(entry.getValue()) && cnt > 1)
                            .forEach(entry -> answer.add(entry.getKey())));
        }

        Collections.sort(answer);
        return answer.toArray(new String[0]);
    }

    public static void combinations(int index, char[] order, String result) {
        if (courseMap.containsKey(result.length())) {
            HashMap<String, Integer> map = courseMap.get(result.length());
            map.put(result, map.getOrDefault(result, 0) + 1);
        }

        for (int i = index; i < order.length; i++) {
            combinations(i + 1, order, result + order[i]);
        }
    }

}


