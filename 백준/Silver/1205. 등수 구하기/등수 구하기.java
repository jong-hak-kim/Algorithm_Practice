import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int newScore = Integer.parseInt(stringTokenizer.nextToken());
        int P = Integer.parseInt(stringTokenizer.nextToken());
        int[] arr = new int[N];
        if (N > 0) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        // 결과는 등수만 구하기!! 라는 것을 기억해야 한다.
        // 랭킹에 들어갈 수 없는 경우를 위쪽 조건에 걸고 else문에는 들어갈 수 있는 경우를 적는다.
        // 
        // 애초에 배열의 크기를 N 만큼만 줬기 때문에 새 점수보다 배열의 값이 더 크면 순위를 증가시키고
        // 
        // 그 외에 경우에는 반복문을 빠져나오면 그 점수의 등수가 구해지게 된다.
        if (N == P && newScore <= arr[arr.length - 1]) {
            System.out.println(-1);
        } else {
            int rank = 1;
            for (int i = 0; i < arr.length; i++) {
                if (newScore < arr[i]) {
                    rank++;
                } else {
                    break;
                }
            }
            System.out.println(rank);
        }
    }
}