import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        List<Character> vowel = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        while (true) {
            String input = bufferedReader.readLine();
            int count = 0;
            if (input.equals("#")) {
                break;
            }
            for (int i = 0; i < input.length(); i++) {
                if (vowel.contains(input.charAt(i))) {
                    count++;
                }
            }

            stringBuilder.append(count).append("\n");
        }
        System.out.println(stringBuilder);
    }
}