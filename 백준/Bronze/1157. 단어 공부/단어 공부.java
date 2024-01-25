import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String word = bufferedReader.readLine();
        char[] words = new char[26];
        for (int i = 0; i < word.length(); i++) {
            if ('A' <= word.charAt(i) && word.charAt(i) <= 'Z') {
                words[word.charAt(i) - 'A']++;
            }

            else {
                words[word.charAt(i) - 'a']++;
            }
        }

        int max = -1;
        char manyChar = '?';
        for (int i = 0; i < words.length; i++) {
            if (words[i] > max) {
                max = words[i];
                manyChar = (char) (i + 'A');
            } else if (words[i] == max) {
                manyChar = '?';
            }
        }
        System.out.println(manyChar);
    }
}