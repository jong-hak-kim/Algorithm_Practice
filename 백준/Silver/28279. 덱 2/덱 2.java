import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        StringTokenizer stringTokenizer;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String command = stringTokenizer.nextToken();
            if (command.equals("1")) {
                int addNum = Integer.parseInt(stringTokenizer.nextToken());
                deque.addFirst(addNum);
                continue;
            }
            if (command.equals("2")) {
                int addNum = Integer.parseInt(stringTokenizer.nextToken());
                deque.addLast(addNum);
                continue;
            }

            if (command.equals("3")) {
                if (deque.isEmpty()) {
                    stringBuilder.append(-1).append("\n");
                    continue;
                }
                stringBuilder.append(deque.removeFirst()).append("\n");
                continue;
            }
            if (command.equals("4")) {
                if (deque.isEmpty()) {
                    stringBuilder.append(-1).append("\n");
                    continue;
                }
                stringBuilder.append(deque.removeLast()).append("\n");
                continue;
            }
            if (command.equals("5")) {
                stringBuilder.append(deque.size()).append("\n");
                continue;
            }
            if (command.equals("6")) {
                if (deque.isEmpty()) {
                    stringBuilder.append(1).append("\n");
                    continue;
                }
                stringBuilder.append(0).append("\n");
                continue;
            }

            if (command.equals("7")) {
                if (deque.isEmpty()) {
                    stringBuilder.append(-1).append("\n");
                    continue;
                }
                stringBuilder.append(deque.getFirst()).append("\n");
                continue;
            }

            if (command.equals("8")) {
                if (deque.isEmpty()) {
                    stringBuilder.append(-1).append("\n");
                    continue;
                }
                stringBuilder.append(deque.getLast()).append("\n");
                continue;
            }
        }
        System.out.println(stringBuilder);
    }
}