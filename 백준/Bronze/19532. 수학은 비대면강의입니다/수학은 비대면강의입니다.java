import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// a * x + b * y = c
// x = (c- b * y) / a
// y = (c - a * x) / b

// d * x + e * y = f
// x = (f - e * y) / d
// y = (f - d * x) / e
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        int c = Integer.parseInt(stringTokenizer.nextToken());
        int d = Integer.parseInt(stringTokenizer.nextToken());
        int e = Integer.parseInt(stringTokenizer.nextToken());
        int f = Integer.parseInt(stringTokenizer.nextToken());

        loop: for (int i = -999; i < 1000; i++) {
            for (int j = -999; j < 1000; j++) {
                if ((a * i + b * j == c) && (d * i + e * j == f)) {
                    System.out.println(i + " " + j);
                    break loop;
                }
            }

        }
    }
}