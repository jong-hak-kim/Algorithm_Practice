import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static Stack<Character> lines = new Stack<>();

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line.equals(".")) {
                break;
            }
            stringBuilder.append(checkBalance(line)).append("\n");
        }
        System.out.println(stringBuilder);
    }

    public static String checkBalance(String line) {
        lines.clear();
        while (true) {
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (c == '(' || c == '[') {
                    lines.push(c);
                } else if (c == ')') {
                    if (lines.isEmpty() || lines.peek() != '(') {
                        return "no";
                    } else {
                        lines.pop();
                    }
                } else if (c == ']') {
                    if (lines.isEmpty() || lines.peek() != '[') {
                        return "no";
                    } else {
                        lines.pop();
                    }
                }
            }
            if (lines.isEmpty()) {
                return "yes";
            } else {
                return "no";
            }
        }
    }
}