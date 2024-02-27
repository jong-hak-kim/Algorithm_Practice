import java.io.*;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        //커서
        //L 왼쪽 한칸
        //D 오른쪽 한칸
        //B 커서 왼쪽 문자 삭제
        //P $ $이라는 문자를 커서 왼쪽에 추가
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayDeque<String> leftStack = new ArrayDeque<>();
        ArrayDeque<String> rightStack = new ArrayDeque<>();

        String write = bufferedReader.readLine();
        String[] arr = write.split("");
        int M = Integer.parseInt(bufferedReader.readLine());
        for (String word : arr){
            leftStack.push(word);
        }
        for (int i = 0; i < M; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String command = stringTokenizer.nextToken();
            if (command.equals("L")) {
                if (!leftStack.isEmpty()) {
                    rightStack.push(leftStack.pop());
                }
                continue;
            }

            if (command.equals("D")) {
                if (!rightStack.isEmpty()) {
                    leftStack.push(rightStack.pop());
                }
                continue;
            }

            if (command.equals("B")) {
                if (!leftStack.isEmpty()) {
                    leftStack.pop();
                }
                continue;
            }

            if (command.equals("P")) {
                String word = stringTokenizer.nextToken();
                leftStack.push(word);
            }

        }
        while(!leftStack.isEmpty()){
            rightStack.push(leftStack.pop());
        }
        while(!rightStack.isEmpty()){
            bufferedWriter.write(rightStack.pop());
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}