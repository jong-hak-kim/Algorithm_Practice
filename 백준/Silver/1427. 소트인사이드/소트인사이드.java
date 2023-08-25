import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char[] array = bufferedReader.readLine().toCharArray();
        Arrays.sort(array);
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }
}