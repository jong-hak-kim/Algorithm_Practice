import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        Map<String, Integer> wordCountMap = new HashMap<>(N, M);

        // 단어 등록, M보다 짧은 단어는 등록 제외
        for (int i = 0; i < N; i++) {
            String word = bufferedReader.readLine();
            if (word.length() >= M) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        List<String> words = new ArrayList<>(wordCountMap.keySet());

        Collections.sort(words, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if (Integer.compare(wordCountMap.get(o1), wordCountMap.get(o2)) != 0) {
                    return Integer.compare(wordCountMap.get(o2), wordCountMap.get(o1));
                }

                if (o1.length() != o2.length()) {
                    return o2.length() - o1.length();
                }
                return o1.compareTo(o2);
            }

        });

        StringBuilder stringBuilder = new StringBuilder();
        for (String string : words) {
            stringBuilder.append(string + "\n");
        }
        System.out.println(stringBuilder);

    }
}