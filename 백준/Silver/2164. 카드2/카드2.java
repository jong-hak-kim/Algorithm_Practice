import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int result = 0;
        Deque<Integer> deque = new ArrayDeque<>();

        // ArrayDeque에 카드 넣기
        for (int i = 1; i < N + 1; i++) {
            deque.add(i);
        }
        // 동작 실행
        for (int i = 0; i < N; i++) {
            if (deque.size() == 1) {
                result = deque.getFirst();
                break;
            }
            // 맨 윗장 버림
            deque.removeFirst();

            // 맨 윗카드 맨 아래로 추가
            deque.addLast(deque.getFirst());

            // 맨 윗카드 삭제
            deque.removeFirst();

        }

        System.out.println(result);
    }
}