import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        StringBuilder stringBuilder = new StringBuilder();
        int P = Integer.parseInt(bufferedReader.readLine());

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < P; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            stringTokenizer.nextToken();
            int count = 0;
            for (int j = 0; j < 20; j++) {
                list.add(Integer.parseInt(stringTokenizer.nextToken()));
            }

            // 현재 값과 앞의 값 비교할 수 있게끔 이중 for문을 만들어주었다.
            for (int j = 1; j < list.size(); j++) {
                for (int k = j - 1; k >= 0; k--) {

                    // 현재 값과 비교 값과 비교하여 비교 값이 크면 현재 값의 자리 앞으로 비교 값이 옴
                    if (list.get(j) < list.get(k)) {
                        count++;
                    }
                }
            }
            stringBuilder.append((i + 1) + " " + count).append("\n");
            list.clear();
        }
        System.out.println(stringBuilder);
    }
}