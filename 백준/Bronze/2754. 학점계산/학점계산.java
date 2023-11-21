import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        String input = bufferedReader.readLine();
        if (input.equals("A+")) {
            stringBuilder.append(4.3);
        }
        if (input.equals("A0")) {
            stringBuilder.append(4.0);
        }
        if (input.equals("A-")) {
            stringBuilder.append(3.7);
        }
        if (input.equals("B+")) {
            stringBuilder.append(3.3);
        }
        if (input.equals("B0")) {
            stringBuilder.append(3.0);
        }
        if (input.equals("B-")) {
            stringBuilder.append(2.7);
        }
        if (input.equals("C+")) {
            stringBuilder.append(2.3);
        }
        if (input.equals("C0")) {
            stringBuilder.append(2.0);
        }
        if (input.equals("C-")) {
            stringBuilder.append(1.7);
        }
        if (input.equals("D+")) {
            stringBuilder.append(1.3);
        }
        if (input.equals("D0")) {
            stringBuilder.append(1.0);
        }
        if (input.equals("D-")) {
            stringBuilder.append(0.7);
        }
        if (input.equals("F")) {
            stringBuilder.append(0.0);
        }

        System.out.println(stringBuilder);
    }
}