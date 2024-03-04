import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers =new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        String input = bufferedReader.readLine();
        String[] split = input.split(" ");
        int N = Integer.parseInt(split[0]);
        int count = 0;
        int next = Integer.parseInt(split[1]);
        int leftNum = 0;
        for (int i = 1; i <= N; i++) {
            numbers.add(i);
        }
        stringBuilder.append("<");
        while(!numbers.isEmpty()){
            count += next;
            while(count > numbers.size()){
                leftNum = count - numbers.size();
                count = leftNum;
            }
            if(numbers.size() == 1){
                stringBuilder.append(numbers.remove(count - 1));
                stringBuilder.append(">");
                count -= 1;
                continue;
            }
            stringBuilder.append(numbers.remove(count - 1)).append(", ");
            count -= 1;
        }

        System.out.println(stringBuilder.toString());
    }
}