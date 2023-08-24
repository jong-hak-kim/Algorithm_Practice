import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int[] intArray = new int[10001];

        int N = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < N; i++) {
            intArray[Integer.parseInt(bufferedReader.readLine())] += 1;
        }

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] != 0) {
                for (int j = 0; j < intArray[i]; j++) {
                    stringBuilder.append(i).append('\n');
                }
            }
        }
        System.out.println(stringBuilder);
    }
}