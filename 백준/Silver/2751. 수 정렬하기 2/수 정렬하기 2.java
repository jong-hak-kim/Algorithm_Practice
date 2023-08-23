import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //원래는 BufferReader와 Arrays.sort를 사용하였지만 시간 초과로 인하여 실패
        //Counting Sort를 이용하여 정렬하여 시간 복잡도를 줄였다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        //수의 범위가 -1,000,000 ~ 1,000,000 이므로 0의 기준을 인덱스 1,000,000으로 잡는다
        boolean[] array = new boolean[2000001];

        int N = Integer.parseInt(bufferedReader.readLine());

        //인덱스는 0 이상이어야 되기 때문에 입력받은 값에서 1,000,000을 더해준 값을 인덱스로 잡아준다.
        for (int i = 0; i < N; i++) {
            array[Integer.parseInt(bufferedReader.readLine()) + 1000000] = true;
        }

        //0부터 배열의 길이까지 반복되는 for문을 사용
        //true였을 때 i 값은 자연스럽게 오름차순(작은 수부터)으로 뽑혀나온다
        //StringBuilder에 값을 넣어주면 끝
        for (int i = 0; i < array.length; i++) {
            if (array[i]) {
                stringBuilder.append((i - 1000000)).append('\n');
            }
        }
        System.out.println(stringBuilder);
    }
}