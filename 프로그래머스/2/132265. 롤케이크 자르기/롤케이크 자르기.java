//자르기
//중복 제외
//서로 개수 같으면 공평한 것
import java.util.HashSet;
import java.util.HashMap;
class Solution {
    public int solution(int[] topping) {
              HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;

        for (int t : topping) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }

        for (int t : topping) {
            set.add(t);
            map.put(t, map.get(t) - 1);

            if (map.get(t) == 0) {
                map.remove(t);
            }

            if (set.size() == map.size()) {
                result++;
            }
        }


        return result;
    }
}