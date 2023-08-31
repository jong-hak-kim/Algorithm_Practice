import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        int N = Integer.parseInt(bufferedReader.readLine());
        int[] origin = new int[N];
        int[] array = new int[N];
        int count = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(stringTokenizer.nextToken());
            origin[i] = array[i];
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (hashMap.containsKey(array[i])) {
                continue;
            } else {
                hashMap.put(array[i], count);
                count++;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < origin.length; i++) {
            stringBuilder.append(hashMap.get(origin[i])).append(" ");
        }
        System.out.println(stringBuilder);
    }
}