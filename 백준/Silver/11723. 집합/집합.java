import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer;
        StringBuilder stringBuilder = new StringBuilder();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String command = stringTokenizer.nextToken();
            if (command.equals("add")) {
                int x = Integer.parseInt(stringTokenizer.nextToken());
                if (!list.contains(x)) {
                    list.add(x);
                }
            } else if (command.equals("remove")) {
                int x = Integer.parseInt(stringTokenizer.nextToken());
                if (list.contains(x)) {
                    for (int j = 0; j < list.size(); j++) {
                        if (list.get(j).equals(x)) {
                            list.remove(j);
                            break;
                        }
                    }
                }

            } else if (command.equals("check")) {
                int x = Integer.parseInt(stringTokenizer.nextToken());
                if (list.contains(x)) {
                    stringBuilder.append("1").append("\n");
                } else {
                    stringBuilder.append("0").append("\n");
                }
            } else if (command.equals("toggle")) {
                int x = Integer.parseInt(stringTokenizer.nextToken());
                if (list.contains(x)) {
                    for (int j = 0; j < list.size(); j++) {
                        if (list.get(j).equals(x)) {
                            list.remove(j);
                            break;
                        }
                    }
                } else {
                    list.add(x);
                }

            } else if (command.equals("all")) {
                list.clear();
                for (int j = 1; j <= 20; j++) {
                    list.add(j);
                }
            } else if (command.equals("empty")) {
                list.clear();
            }
        }
        System.out.println(stringBuilder);
    }
}