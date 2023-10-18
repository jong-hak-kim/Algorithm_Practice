import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        LinkedList<Integer> list = new LinkedList<>();
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<");

        int index = 0;

        while (N > 1) {
            index = (index + (K - 1)) % N;

            stringBuilder.append(list.remove(index)).append(", ");
            N--;
        }

        stringBuilder.append(list.remove()).append(">");
        System.out.println(stringBuilder);

    }
}