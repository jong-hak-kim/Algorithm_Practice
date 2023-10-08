import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static int[] Narray;
    static int[] Marray;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        Narray = new int[N];
        HashMap<Integer, Integer> resultMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(stringTokenizer.nextToken());
            Narray[i] = num;
            resultMap.put(num, resultMap.getOrDefault(num, 0) + 1);
        }
        int M = Integer.parseInt(bufferedReader.readLine());
        Marray = new int[M];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(stringTokenizer.nextToken());
            Marray[i] = num;
            stringBuilder.append(resultMap.getOrDefault(num, 0)).append(" ");
        }

        System.out.println(stringBuilder);
        // for (int i = 0; i < N; i++) {
        // int first = 0;
        // int last = M - 1;
        // findNum(Narray[i], first, last);
        // }

    }

    static void findNum(int num, int first, int last) {
        int mid = 0;
        while (first <= last) {
            mid = (first + last) / 2;
            if (Marray[mid] == num) {
                // result[mid]++;
                break;
            }
            if (Marray[mid] < num) {
                last = mid - 1;
                continue;
            }
            if (Marray[mid] > num) {
                first = mid + 1;
                continue;
            }
        }
    }
}