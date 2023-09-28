import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(bufferedReader.readLine());
        int sum = 0;
        int[] array = new int[K];
        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(bufferedReader.readLine());
            int count = 1;
            if (num == 0) {
                while (true) {
                    if (array[i - count] == 0) {
                        count++;
                    } else {
                        array[i - count] = 0;
                        break;
                    }
                }

            } else {
                array[i] = num;
            }
        }
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println(sum);
    }
}