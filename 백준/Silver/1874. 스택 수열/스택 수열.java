import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    static int sequence = 0;
    static boolean error;

    public static void main(String[] args) throws IOException {
        Deque<Integer> stack = new ArrayDeque<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(bufferedReader.readLine());
            if (num > sequence) {
                for (int j = sequence + 1; j <= num; j++) {
                    stack.add(j);
                    stringBuilder.append("+").append("\n");
                }
                sequence = num;
            } else if (!stack.peekLast().equals(num)) {
                System.out.println("NO");
                return;
            }

            stack.pollLast();
            stringBuilder.append("-").append("\n");
        }
        System.out.println(stringBuilder.toString());
    }
}