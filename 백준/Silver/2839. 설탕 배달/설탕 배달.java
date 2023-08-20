import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int bag = Integer.parseInt(bufferedReader.readLine());
        int result = 0;
        while (true) {
            if (bag % 5 == 0) {
                result += bag / 5;
                System.out.println(result);
                break;
            } else {
                bag -= 3;
                result++;
            }
            if (bag < 0) {
                System.out.println(-1);
                break;
            }
        }

    }

}