import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int T = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < T; i++) {
            int count = 1;
            String str = bufferedReader.readLine();
            char[] strArray = str.toCharArray();
            stringBuilder.append(isPalindrome(strArray) + " " + countRecursion(strArray, 0, strArray.length - 1, count))
                    .append("\n");
        }
        System.out.println(stringBuilder);

    }

    public static int recursion(char[] strArray, int l, int r) {
        if (l >= r) {
            return 1;
        } else if (strArray[l] != strArray[r]) {
            return 0;
        } else {
            return recursion(strArray, l + 1, r - 1);
        }
    }

    public static int countRecursion(char[] strArray, int l, int r, int count) {
        if (l >= r) {
            return count;
        } else if (strArray[l] != strArray[r]) {
            return count;
        } else {
            return countRecursion(strArray, l + 1, r - 1, count + 1);
        }
    }

    public static int isPalindrome(char[] strArray) {
        return recursion(strArray, 0, strArray.length - 1);
    }

}