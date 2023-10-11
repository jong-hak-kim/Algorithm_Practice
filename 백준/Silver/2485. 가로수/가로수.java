import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int[] array = new int[N];
        int[] distance = new int[N - 1];
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }

        for (int i = 1; i < N; i++) {
            distance[i - 1] = array[i] - array[i - 1];
        }

        int lastGCD = 0;
        int result = 0;
        for (int i = 1; i < distance.length; i++) {
            if (i == 1) {
                result = getGCD(distance[i - 1], distance[i]);
                lastGCD = result;
                continue;
            }
            result = getGCD(lastGCD, distance[i]);
        }

        int count = 0;
        for (int i = 0; i < distance.length; i++) {
            if (distance[i] >= (result * 2)) {
                count += (distance[i] / result) - 1;
            }
        }

        System.out.println(count);
    }

    public static int getGCD(int A, int B) {
        while (B != 0) {
            int result = A % B;
            A = B;
            B = result;
        }
        return A;
    }
}