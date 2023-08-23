import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(bufferedReader.readLine());
        int B = Integer.parseInt(bufferedReader.readLine());
        int C = Integer.parseInt(bufferedReader.readLine());
        String result = "" + A * B * C;
        char[] array = new char[result.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = result.charAt(i);
        }
        for (int i = 0; i <= 9; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                char chari = (char) (i + 48);
                if (Character.compare(chari, array[j]) == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}