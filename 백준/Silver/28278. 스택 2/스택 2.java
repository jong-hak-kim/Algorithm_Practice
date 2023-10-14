import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int command = Integer.parseInt(stringTokenizer.nextToken());
            if (command == 1) {
                int X = Integer.parseInt(stringTokenizer.nextToken());
                stack.push(X);
            }
            if (command == 2) {
                if (stack.isEmpty()) {
                    stringBuilder.append(-1).append("\n");
                    continue;
                }
                stringBuilder.append(stack.pop()).append("\n");

            }
            if (command == 3) {
                stringBuilder.append(stack.size()).append("\n");
            }
            if (command == 4) {
                if (!stack.isEmpty()) {
                    stringBuilder.append(0).append("\n");
                    continue;
                }
                if (stack.isEmpty()) {
                    stringBuilder.append(1).append("\n");
                }
            }
            if (command == 5) {
                if (stack.isEmpty()) {
                    stringBuilder.append(-1).append("\n");
                    continue;
                }
                stringBuilder.append(stack.peek()).append("\n");
            }
        }

        System.out.println(stringBuilder);
    }
}