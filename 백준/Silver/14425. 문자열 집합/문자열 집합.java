import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static String[] Narray;
    static String[] Marray;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        Narray = new String[N];
        Marray = new String[M];
        for (int i = 0; i < N; i++) {
            Narray[i] = bufferedReader.readLine();
        }

        for (int i = 0; i < M; i++) {
            Marray[i] = bufferedReader.readLine();
        }

        Arrays.sort(Narray);
        int count = 0;
        int result = 0;
        for (int i = 0; i < M; i++) {
            result = Arrays.binarySearch(Narray, Marray[i]);
            if (result < 0) {
                continue;
            }
            if (result >= 0) {
                count++;
            }
        }
        System.out.println(count);
    }

}