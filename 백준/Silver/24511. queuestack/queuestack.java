import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        StringBuilder stringBuilder = new StringBuilder();

        StringTokenizer typeStringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 0; i < N; i++) {
            int type = Integer.parseInt(typeStringTokenizer.nextToken());
            int num = Integer.parseInt(stringTokenizer.nextToken());
            if (type == 0) {
                arrayDeque.add(num);
            }
        }

        int M = Integer.parseInt(bufferedReader.readLine());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int insertNum = 0;
        for (int i = 0; i < M; i++) {
            insertNum = Integer.parseInt(stringTokenizer.nextToken());
            arrayDeque.addFirst(insertNum);
            stringBuilder.append(arrayDeque.pollLast()).append(" ");
        }

        System.out.println(stringBuilder);

    }
}