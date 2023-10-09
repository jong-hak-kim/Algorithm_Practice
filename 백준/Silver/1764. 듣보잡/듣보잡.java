import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        HashMap<String, Integer> hashMap = new HashMap<>();
        int count = 0;
        for (int i = 0; i < N + M; i++) {
            String name = bufferedReader.readLine();
            hashMap.put(name, hashMap.getOrDefault(name, 0) + 1);
            if (hashMap.get(name) == 2) {
                count++;
            }
        }

        List<String> sortHash = new ArrayList<>(hashMap.keySet());
        sortHash.sort((e1, e2) -> e1.compareTo(e2));

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(count).append("\n");
        for (String str : sortHash) {
            if (hashMap.get(str) == 2) {
                stringBuilder.append(str).append("\n");
            }
        }
        System.out.println(stringBuilder);
    }
}