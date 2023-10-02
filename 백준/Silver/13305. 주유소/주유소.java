import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        long[] roadLength = new long[N - 1];
        long[] city = new long[N - 1];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        long sum = 0;

        for (int i = 0; i < N - 1; i++) {
            roadLength[i] = Long.parseLong(stringTokenizer.nextToken());
        }
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N - 1; i++) {
            city[i] = Long.parseLong(stringTokenizer.nextToken());
        }
        stringTokenizer.nextToken();
        long lastCity = 0;
        for (int i = 1; i < city.length; i++) {
            lastCity = city[i - 1];
            if (lastCity < city[i]) {
                city[i] = lastCity;
            }
        }

        for (int i = 0; i < city.length; i++) {
            sum += city[i] * roadLength[i];
        }
        System.out.println(sum);

    }
}