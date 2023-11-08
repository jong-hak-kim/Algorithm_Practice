import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        String X = stringTokenizer.nextToken();
        StringBuilder reverseX = new StringBuilder();
        reverseX.append(X).reverse();
        int reverseIntX = Integer.parseInt(reverseX.toString());
        String Y = stringTokenizer.nextToken();
        StringBuilder reverseY = new StringBuilder();
        reverseY.append(Y).reverse();
        int reverseIntY = Integer.parseInt(removeZero(reverseY.toString()));
        int sum = reverseIntX + reverseIntY;
        StringBuilder reverseSum = new StringBuilder();
        reverseSum.append(sum).reverse();
        System.out.println(removeZero(reverseSum.toString()));
    }

    public static String removeZero(String input) {
        while (input.charAt(0) == '0') {
            input = input.substring(1);
        }
        return input;
    }
}