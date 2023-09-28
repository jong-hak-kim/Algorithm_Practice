import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int[][] array = new int[15][15];
        int k = 0;
        int n = 0;
        for (int i = 0; i < array.length; i++) {
            array[0][i] = i;
            array[i][1] = 1;
        }
        for (int i = 1; i < array.length; i++) {
            for (int j = 2; j < array[i].length; j++) {
                array[i][j] = array[i - 1][j] + array[i][j - 1];
            }
        }

        int testCase = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < testCase; i++) {
            k = Integer.parseInt(bufferedReader.readLine());
            n = Integer.parseInt(bufferedReader.readLine());
            stringBuilder.append(array[k][n] + "\n");
        }
        System.out.println(stringBuilder);
    }
}