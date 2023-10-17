import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int[] array = new int[N];
        Stack<Integer> line = new Stack<>();
        int count = 1;
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(stringTokenizer.nextToken());
            array[i] = num;
        }

        for (int i = 0; i < N; i++) {
            if (array[i] != count) {
                if (!line.isEmpty() && line.peek() == count) {
                    line.pop();
                    i--;
                    count++;
                } else {
                    line.push(array[i]);
                }
            } else {
                count++;
            }
        }
        int numberCount = line.size();
        for (int i = 0; i < numberCount; i++) {
            if (line.peek() == count) {
                line.pop();
                count++;
            } else {
                break;
            }
        }

        if (line.isEmpty()) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }

    }
}