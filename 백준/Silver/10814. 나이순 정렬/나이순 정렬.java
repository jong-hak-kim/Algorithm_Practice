import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        int N = Integer.parseInt(bufferedReader.readLine());
        String[][] array = new String[N][2];
        for (int i = 0; i < array.length; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            array[i][0] = stringTokenizer.nextToken();
            array[i][1] = stringTokenizer.nextToken();
        }

        Arrays.sort(array, new Comparator<String[]>() {
            @Override
            public int compare(String[] s1, String[] s2) {
                if (Integer.parseInt(s1[0]) == Integer.parseInt(s2[0])) {
                    return 0;
                } else {
                    return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
                }

            }
        });
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i][0] + " " + array[i][1]).append("\n");
        }
        System.out.println(stringBuilder);

    }
}