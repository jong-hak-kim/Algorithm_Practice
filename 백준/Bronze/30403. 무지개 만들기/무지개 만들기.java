import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean isEmptyLowerRainbow = false;
        boolean isEmptyUpperRainbow = false;

        List<Character> lowerRainbow = makeLowerRainbow();
        List<Character> upperRainbow = makeUpperRainbow();
        int N = Integer.parseInt(bufferedReader.readLine());
        String input = bufferedReader.readLine();
        for (int i = 0; i < N; i++) {
            if (lowerRainbow.contains(input.charAt(i))) {
                int removeIndex = lowerRainbow.indexOf(input.charAt(i));
                lowerRainbow.remove(removeIndex);
            }

            if (upperRainbow.contains(input.charAt(i))) {
                int removeIndex = upperRainbow.indexOf(input.charAt(i));
                upperRainbow.remove(removeIndex);
            }
        }

        if (lowerRainbow.isEmpty()) {
            isEmptyLowerRainbow = true;
        }

        if (upperRainbow.isEmpty()) {
            isEmptyUpperRainbow = true;
        }

        String result = getResult(isEmptyLowerRainbow, isEmptyUpperRainbow);
        System.out.println(result);
    }

    public static List<Character> makeLowerRainbow() {
        List<Character> lowerRainbow = new ArrayList<>();
        lowerRainbow.add('r');
        lowerRainbow.add('o');
        lowerRainbow.add('y');
        lowerRainbow.add('g');
        lowerRainbow.add('b');
        lowerRainbow.add('i');
        lowerRainbow.add('v');

        return lowerRainbow;
    }

    public static List<Character> makeUpperRainbow() {
        List<Character> upperRainbow = new ArrayList<>();
        upperRainbow.add('R');
        upperRainbow.add('O');
        upperRainbow.add('Y');
        upperRainbow.add('G');
        upperRainbow.add('B');
        upperRainbow.add('I');
        upperRainbow.add('V');

        return upperRainbow;
    }

    public static String getResult(boolean isEmptyLowerRainbow, boolean isEmptyUpperRainbow) {
        if (isEmptyLowerRainbow && isEmptyUpperRainbow) {
            return "YeS";
        }

        if (isEmptyLowerRainbow) {
            return "yes";
        }

        if (isEmptyUpperRainbow) {
            return "YES";
        }
        return "NO!";
    }
}