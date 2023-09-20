import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int newScore = Integer.parseInt(stringTokenizer.nextToken());
        int P = Integer.parseInt(stringTokenizer.nextToken());
        List<Integer> list = new ArrayList<>();
        int[] array = new int[P];
        array[0] = 1;

        // N이 0보다 크면 둘째 줄 받기
        // 그 외에 경우에는 1 출력
        if (N > 0) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int i = 0; i < N; i++) {
                list.add(Integer.parseInt(stringTokenizer.nextToken()));
            }

            Collections.sort(list);
            Collections.reverse(list);

            // * 리스트의 개수가 P보다 작을 경우
            // => 리스트에 새로운 수 추가 후 내림차순 정렬

            // * 리스트의 개수가 P와 같을 경우
            // => 새로운 수가 리스트의 마지막 수보다 작거나 같을 경우
            // => 랭킹에 못들어가므로 -1 출력
            // => 위 경우를 제외하면 리스트에 새로운 수 추가 후 내림차순 정렬

            // * 정렬 후 리스트 크기가 P보다 큰 경우
            // => 랭킹 최대 등록 수를 넘어선 것이므로 맨 뒷 수 삭제

            if (list.size() < P) {
                orderList(list, array, newScore, P);
            } else if (list.size() == P) {
                if (list.size() == P && newScore <= list.get((list.size() - 1))) {
                    System.out.println(-1);
                } else {
                    orderList(list, array, newScore, P);
                }
            } else {
                System.out.println(-1);
            }

        } else {
            System.out.println(1);
        }
    }

    public static void orderList(List<Integer> list, int[] array, int newScore, int P) {
        list.add(newScore);
        Collections.sort(list);
        Collections.reverse(list);

        if (list.size() > P) {
            list.remove(list.size() - 1);
        }

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == list.get(i - 1)) {
                array[i] = array[i - 1];
            } else {
                array[i] = i + 1;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == newScore) {
                System.out.println(array[i]);
                break;
            }
        }
    }
}