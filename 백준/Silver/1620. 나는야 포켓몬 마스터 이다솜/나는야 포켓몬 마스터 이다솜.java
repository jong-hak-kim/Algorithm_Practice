import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static HashMap<String, Integer> pocketmonMap;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        pocketmonMap = new HashMap<>();
        String[] keyArray = new String[N + 1];

        for (int i = 1; i < N + 1; i++) {
            String name = bufferedReader.readLine();
            keyArray[i] = name;
            pocketmonMap.put(keyArray[i], i);
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String str = bufferedReader.readLine();
            if (!pocketmonMap.containsKey(str)) {
                int num = Integer.parseInt(str);
                stringBuilder.append(keyArray[num]).append("\n");
                continue;
            }
            if (pocketmonMap.containsKey(str)) {
                stringBuilder.append(pocketmonMap.get(str)).append("\n");
            }
        }

        System.out.println(stringBuilder);

    }
}