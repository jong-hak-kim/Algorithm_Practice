import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int N = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String command = stringTokenizer.nextToken();
            if (command.equals("push_front")) {
                int X = Integer.parseInt(stringTokenizer.nextToken());
                deque.addFirst(X);
            }
            if (command.equals("push_back")) {
                int X = Integer.parseInt(stringTokenizer.nextToken());
                deque.addLast(X);
            }
            if (command.equals("pop_front")) {
                if (deque.isEmpty()) {
                    stringBuilder.append(-1).append("\n");
                    continue;
                }
                stringBuilder.append(deque.getFirst()).append("\n");
                deque.removeFirst();
            }
            if (command.equals("pop_back")) {
                if (deque.isEmpty()) {
                    stringBuilder.append(-1).append("\n");
                    continue;
                }
                stringBuilder.append(deque.getLast()).append("\n");
                deque.removeLast();
            }
            if (command.equals("size")) {
                stringBuilder.append(deque.size()).append("\n");
            }
            if (command.equals("empty")) {
                if (deque.isEmpty()) {
                    stringBuilder.append(1).append("\n");
                    continue;
                }
                stringBuilder.append(0).append("\n");
            }
            if (command.equals("front")) {
                if (deque.isEmpty()) {
                    stringBuilder.append(-1).append("\n");
                    continue;
                }
                stringBuilder.append(deque.getFirst()).append("\n");
            }
            if (command.equals("back")) {
                if (deque.isEmpty()) {
                    stringBuilder.append(-1).append("\n");
                    continue;
                }
                stringBuilder.append(deque.getLast()).append("\n");
            }
        }
        System.out.println(stringBuilder);
    }
}