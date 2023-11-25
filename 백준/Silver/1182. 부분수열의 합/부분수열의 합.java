import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, S;
    static int[] value;
    static int count;
    static int currentSum;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        S = Integer.parseInt(stringTokenizer.nextToken());
        value = new int[N];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(stringTokenizer.nextToken());
            value[i] = num;
        }

        dfs(0);
        System.out.println(count);
    }

    public static void dfs(int current) {
        if (current == N) {
            return;
        }

        if (currentSum + value[current] == S) {
            count++;
        }

        dfs(current + 1);

        currentSum += value[current];
        dfs(current + 1);

        currentSum -= value[current];

    }
}