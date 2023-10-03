import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        int i = 0;
        while (true) {
            i++;
            String num = Integer.toString(i);
            while (input.length() > 0 && num.length() > 0) {
                if (input.charAt(0) == num.charAt(0)) {
                    input = input.substring(1);
                }
                num = num.substring(1);
            }
            if (input == "") {
                System.out.println(i);
                break;
            }
        }
    }
}