import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < T; i++) {
            String ps = bufferedReader.readLine();
            stringBuilder.append(checkVPS(ps)).append("\n");
        }
        System.out.println(stringBuilder);

    }

    static String checkVPS(String ps) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < ps.length(); i++) {
            char c = ps.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (stack.empty()) {
                return "NO";
            } else {
                stack.pop();
            }
        }
        if (stack.empty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}