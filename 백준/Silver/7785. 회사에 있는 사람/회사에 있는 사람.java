import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer;
        HashMap<String, String> peopleMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String name = stringTokenizer.nextToken();
            String status = stringTokenizer.nextToken();
            if (status.equals("leave")) {
                peopleMap.remove(name);
                continue;
            }
            if (status.equals(("enter"))) {
                peopleMap.put(name, status);
            }
        }

        List<String> peopleList = new ArrayList<>(peopleMap.keySet());
        peopleList.sort((e1, e2) -> e2.compareTo(e1));

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < peopleList.size(); i++) {
            stringBuilder.append(peopleList.get(i)).append("\n");
        }
        System.out.println(stringBuilder);
    }
}