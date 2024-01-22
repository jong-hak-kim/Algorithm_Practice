import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[9];
        int num = 0;
        int max = 0;
        int maxIndex = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = 0; index < array.length; index++) {
            num = Integer.parseInt(bufferedReader.readLine());
            array[index] = num;
            if (max < array[index] || index == 0) {
                max = array[index];
                maxIndex = index + 1;
            }
        }
        stringBuilder.append(max + "\n" + maxIndex);
        System.out.println(stringBuilder.toString());

    }
}