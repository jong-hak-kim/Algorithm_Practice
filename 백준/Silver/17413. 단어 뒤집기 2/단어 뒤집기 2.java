import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String words = bufferedReader.readLine();
        StringBuilder stringBuilder = new StringBuilder();
        boolean flag = false;
        ArrayDeque<Character> arrayDeque = new ArrayDeque<>();
        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) == '<') {
                while (!arrayDeque.isEmpty()) {
                    stringBuilder.append(arrayDeque.pop());
                }
                flag = true;
                stringBuilder.append(words.charAt(i));
                continue;
            }

            if (words.charAt(i) == '>') {
                flag = false;
                stringBuilder.append(words.charAt(i));
                continue;
            }

            if (flag) {
                stringBuilder.append(words.charAt(i));
                continue;
            }
            if (words.charAt(i) == ' ') {
                while (!arrayDeque.isEmpty()) {
                    stringBuilder.append(arrayDeque.pop());
                }
                stringBuilder.append(words.charAt(i));
                continue;
            }
            arrayDeque.push(words.charAt(i));

        }

        while (!arrayDeque.isEmpty()) {
            stringBuilder.append(arrayDeque.pop());
        }

        System.out.println(stringBuilder);


    }
}