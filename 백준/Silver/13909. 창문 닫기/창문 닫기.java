import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean[] window;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int sum = 0;
        int count = 0;
        while (sum < N) {
            count++;
            sum += (2 * count) + 1;
        }
        System.out.println(count);
    }

}