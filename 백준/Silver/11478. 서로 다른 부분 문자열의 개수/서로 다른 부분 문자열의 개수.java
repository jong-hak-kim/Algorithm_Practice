import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        Set<String> set = new HashSet<>();
        int num = 0;

        for (int i = 0; i < str.length(); i++) {
            num++;
            for (int j = 0; (j + num) <= str.length(); j++) {
                set.add(str.substring(j, j + num));
            }
        }
        System.out.println(set.size());
    }
}