import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        String input = bufferedReader.readLine();
        stringBuilder.append(input);
        for (int i = 0; i < input.length(); i++) {
            char inputchar = input.charAt(i);
            if (Character.isUpperCase(inputchar)) {
                stringBuilder.setCharAt(i, Character.toLowerCase(inputchar));
            }
            if (Character.isLowerCase(inputchar)) {
                stringBuilder.setCharAt(i, Character.toUpperCase(inputchar));
            }
        }
        System.out.println(stringBuilder);
    }
}