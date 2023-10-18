import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());
        Deque<Integer> josephus = new ArrayDeque<>();
        List<Integer> numberList = new ArrayList<>();
        int count = 0;

        for (int i = 1; i <= N; i++) {
            numberList.add(i);
        }
        while (numberList.size() != 0) {

            for (int i = 0; i < numberList.size(); i++) {

                count++;
                if (count == K) {
                    josephus.add(numberList.get(i));
                    numberList.remove(i);
                    count = 0;
                    i--;
                }
            }
        }
        int josephusSize = josephus.size();
        for (int i = 0; i < josephusSize; i++) {
            if (i == 0) {
                stringBuilder.append("<" + josephus.getFirst());
                josephus.removeFirst();
            } else {
                stringBuilder.append(", " + josephus.getFirst());
                josephus.removeFirst();
            }
        }
        stringBuilder.append(">");
        System.out.println(stringBuilder);

    }
}