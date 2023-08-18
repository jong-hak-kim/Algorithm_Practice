import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int count = 0;
        int num = 0;
        while (count < N) {
            num++;
            String strNum = "" + num;
            if (strNum.contains("666")) {
                count++;
            }
        }
        System.out.println(num);

    }
}