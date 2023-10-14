import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static Stack<Integer> stack = new Stack<>();
    static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < N; i++) {
            String select = bufferedReader.readLine();
            Solution(select);
        }
        System.out.println(stringBuilder);
    }

    static void Solution(String select) {
        char command = select.charAt(0);
        if (command == '1') {
            int X = Integer.parseInt(select.substring(2));
            stack.push(X);
        }
        if (command == '2') {
            if (stack.isEmpty()) {
                stringBuilder.append(-1).append("\n");
                return;
            }
            stringBuilder.append(stack.pop()).append("\n");

        }
        if (command == '3') {
            stringBuilder.append(stack.size()).append("\n");
        }
        if (command == '4') {
            if (!stack.isEmpty()) {
                stringBuilder.append(0).append("\n");
                return;
            }
            if (stack.isEmpty()) {
                stringBuilder.append(1).append("\n");
            }
        }
        if (command == '5') {
            if (stack.isEmpty()) {
                stringBuilder.append(-1).append("\n");
                return;
            }
            stringBuilder.append(stack.peek()).append("\n");
        }
    }
}