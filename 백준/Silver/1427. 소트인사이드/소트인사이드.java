import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int N = Integer.parseInt(bufferedReader.readLine());
        String strN = "" + N;
        char[] array = new char[strN.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = strN.charAt(i);
        }
        Arrays.sort(array);
        stringBuilder.append(array).reverse();
        System.out.println(stringBuilder);
    }
}