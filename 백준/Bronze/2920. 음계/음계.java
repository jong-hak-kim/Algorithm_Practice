import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < 8; i++) {
            stringBuilder.append(stringTokenizer.nextToken());
        }
        if (stringBuilder.toString().equals("12345678")) {
            System.out.println("ascending");
        } else if (stringBuilder.toString().equals("87654321")) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}