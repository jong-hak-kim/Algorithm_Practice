import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] arsg) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());
        int result = 0;
        String Line = bufferedReader.readLine();
        boolean[] array = new boolean[N];
        for (int i = 0; i < Line.length(); i++) {
            if (Line.charAt(i) == 'P') {
                int min = Math.max(i - K, 0);
                int max = Math.min(i + K, (Line.length() - 1));
                for (int j = min; j <= max; j++) {
                    if (Line.charAt(j) == 'H' && array[j] == false) {
                        result++;
                        array[i] = true;
                        array[j] = true;
                        break;
                    }
                }
            }
        }
        System.out.println(result);

    }
}