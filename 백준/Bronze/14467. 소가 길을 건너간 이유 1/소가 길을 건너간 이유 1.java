import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    private static HashMap<Integer, Integer> result = new HashMap<>();
    private static int count = 0;

    public static void main(String[] args) throws IOException {
        //Map으로 풀면 될듯
        //1. 관찰 횟수만큼 반복
        //2. Map에 소 번호와 관찰 위치 검사
        //2-1. 소 번호가 이미 존재하고 위치가 바뀌었을 경우 카운팅

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer;
        int N = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int cowNum = Integer.parseInt(stringTokenizer.nextToken());
            int road = Integer.parseInt(stringTokenizer.nextToken());
            checkCow(cowNum, road);
        }

        System.out.println(count);
    }

    public static void checkCow(int cowNum, int road){
        if(result.containsKey(cowNum)){
            if(result.get(cowNum) != road){
                count++;
            }
        }
        result.put(cowNum, road);
    }
}