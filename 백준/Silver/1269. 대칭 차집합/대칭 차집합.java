import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int A = Integer.parseInt(stringTokenizer.nextToken());
        int B = Integer.parseInt(stringTokenizer.nextToken());
        Set<Integer> set = new HashSet<>();
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < A; i++) {
            int num = Integer.parseInt(stringTokenizer.nextToken());
            set.add(num);
        }
        int count = 0;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < B; i++) {
            int num = Integer.parseInt(stringTokenizer.nextToken());
            if (set.contains(num)) {
                count++;
            }
            set.add(num);
        }
        System.out.println(set.size() - count);
    }
}