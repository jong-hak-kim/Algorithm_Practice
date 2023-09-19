import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        String game = stringTokenizer.nextToken();
        HashSet<String> hashSet = new HashSet<>();
        int result = 0;
        for (int i = 0; i < N; i++) {
            String name = bufferedReader.readLine();
            hashSet.add(name);
        }

        result = hashSet.size() / (person(game) - 1);

        System.out.println(result);
    }

    public static int person(String game) {
        if (game.equals("Y")) {
            return 2;
        }
        if (game.equals("F")) {
            return 3;
        } else {
            return 4;
        }

    }
}