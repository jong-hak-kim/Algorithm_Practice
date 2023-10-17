import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    static Deque<Integer> deque = new ArrayDeque<>();
    static StringBuilder stringBuilder = new StringBuilder();
    static StringTokenizer stringTokenizer;

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            String command = bufferedReader.readLine();
            if (command.contains("push")) {
                stringTokenizer = new StringTokenizer(command);
                stringTokenizer.nextToken();
                deque.add(Integer.parseInt(stringTokenizer.nextToken()));
            } else if (command.equals("pop")) {
                if (deque.isEmpty()) {
                    stringBuilder.append(-1).append("\n");
                    continue;
                }
                stringBuilder.append(deque.remove()).append("\n");
            } else if (command.equals("size")) {
                stringBuilder.append(deque.size()).append("\n");
            } else if (command.equals("empty")) {
                if (deque.isEmpty()) {
                    stringBuilder.append(1).append("\n");
                } else {
                    stringBuilder.append(0).append("\n");
                }
            } else if (command.equals("front")) {
                if (deque.isEmpty()) {
                    stringBuilder.append(-1).append("\n");
                    continue;
                }
                stringBuilder.append(deque.getFirst()).append("\n");
            } else if (command.equals("back")) {
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