import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int A = Integer.parseInt(stringTokenizer.nextToken());
        int B = Integer.parseInt(stringTokenizer.nextToken());
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < A; i++) {
            int num = Integer.parseInt(stringTokenizer.nextToken());
            hashMap.put(num, 0);
        }
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < B; i++) {
            int num = Integer.parseInt(stringTokenizer.nextToken());
            if (hashMap.containsKey(num)) {
                hashMap.put(num, 1);
                continue;
            }
            hashMap.put(num, 0);
        }

        int count = 0;
        for (Integer num : hashMap.keySet()) {
            if (hashMap.get(num) == 0) {
                count++;
                continue;
            }
        }
        System.out.println(count);
    }
}