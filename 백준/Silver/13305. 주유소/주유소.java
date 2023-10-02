import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int[] roadLength = new int[N - 1];
        int[] city = new int[N];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int sum = 0;
        int min = 0;

        //도로 길이 배열 등록
        for (int i = 0; i < roadLength.length; i++) {
            roadLength[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        //도시 리터당 가격 배열 등록, 최소 가격인 도시 구하기
        for (int i = 0; i < city.length; i++) {
            int num = Integer.parseInt(stringTokenizer.nextToken());
            city[i] = num;
            if (i == 0) {
                min = num;
            } else if (num < min && i != city.length - 1) {
                min = num;
            }
        }

        //한 도시씩 가다가 최소 가격인 도시가 나오면 나머지 도로 길이만큼 리터 구입하여 최종 가격 구하기
        for (int i = 0; i < roadLength.length; i++) {
            if (city[i] == min) {
                for (int j = i; j < roadLength.length; j++) {
                    sum += city[i] * roadLength[j];
                }
                break;
            }
            sum += city[i] * roadLength[i];
        }

        System.out.println(sum);
    }
}