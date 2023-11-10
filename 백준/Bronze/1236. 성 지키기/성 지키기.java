import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        List<String> castle = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            castle.add(bufferedReader.readLine());
        }
        int rowCount = 0;
        for (int i = 0; i < castle.size(); i++) {
            if (!castle.get(i).contains("X")) {
                rowCount++;
            }
        }

        int columnCount = 0;
        for (int i = 0; i < M; i++) {
            boolean column = false;
            for (int j = 0; j < N; j++) {
                if (castle.get(j).charAt(i) == 'X') {
                    column = true;
                    break;
                }
            }
            if (!column) {
                columnCount++;
            }
        }

        System.out.println(Math.max(rowCount, columnCount));
    }
}