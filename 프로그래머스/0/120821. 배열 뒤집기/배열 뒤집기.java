import java.util.List;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] num_list) {
        Integer[] result = Arrays.stream(num_list).boxed().toArray(Integer[]::new);
        List<Integer> list = Arrays.asList(result);
        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}