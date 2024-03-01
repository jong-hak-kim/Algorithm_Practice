import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        StringBuilder stringBuilder = new StringBuilder();
        int N = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String command = stringTokenizer.nextToken();
            if(command.equals("push")){
                int number = Integer.parseInt(stringTokenizer.nextToken());
                deque.addLast(number);
                continue;
            }
            if(command.equals("pop")){
                if(deque.isEmpty()){
                    stringBuilder.append("-1").append("\n");
                    continue;
                }
                stringBuilder.append(deque.pop()).append("\n");
                continue;
            }

            if(command.equals("size")){
                stringBuilder.append(deque.size()).append("\n");
                continue;
            }

            if(command.equals("empty")){
                if(deque.isEmpty()){
                    stringBuilder.append(1).append("\n");
                    continue;
                }
                stringBuilder.append(0).append("\n");
                continue;
            }

            if(command.equals("front")){
                if(deque.isEmpty()){
                    stringBuilder.append(-1).append("\n");
                    continue;
                }
                stringBuilder.append(deque.peekFirst()).append("\n");
                continue;
            }

            if(command.equals("back")){
                if(deque.isEmpty()){
                    stringBuilder.append(-1).append("\n");
                    continue;
                }
                stringBuilder.append(deque.peekLast()).append("\n");
            }
        }

        System.out.println(stringBuilder.toString());
    }
}