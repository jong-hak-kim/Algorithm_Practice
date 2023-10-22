import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int balloonNumber = 1;
        StringTokenizer stringTokenizer;
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int[] array = new int[N];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            deque.add(i + 1);
            array[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int num = array[balloonNumber - 1];
            if (i == 0) {
                stringBuilder.append(balloonNumber);
                deque.removeFirst();
                continue;
            }

            if (num > 0) {
                for (int j = 0; j < num - 1; j++) {
                    deque.addLast(deque.poll());
                }
                balloonNumber = deque.getFirst();
                stringBuilder.append(" " + balloonNumber);
                deque.poll();
            }
            if (num < 0) {
                for (int j = 0; j < (num * -1) - 1; j++) {
                    deque.addFirst(deque.pollLast());
                }
                balloonNumber = deque.getLast();
                stringBuilder.append(" " + balloonNumber);
                deque.pollLast();
            }

        }

        System.out.println(stringBuilder);
    }
}