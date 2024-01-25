import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int sum = 0;
        String number = bufferedReader.readLine();
        for (int i = 0; i < N; i++) {
            int strNum = number.charAt(i) - '0';
            sum += strNum;
        }
        System.out.println(sum);
    }
}