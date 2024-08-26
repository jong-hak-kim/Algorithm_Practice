import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Arrays;

class Solution {
 public String[] solution(String[] strings, int n) {
        Comparator<String> comparator = Comparator.comparingInt((String o) -> o.charAt(n))
                .thenComparing(Comparator.naturalOrder());

        PriorityQueue<String> queue = new PriorityQueue<>(comparator);

        String[] result = new String[strings.length];

        queue.addAll(Arrays.asList(strings));

        for (int i = 0; i < strings.length; i++) {
            result[i] = queue.poll();
        }

        return result;
    }
}