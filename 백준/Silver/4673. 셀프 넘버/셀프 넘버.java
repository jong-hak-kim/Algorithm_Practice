import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean[] array = new boolean[10001];
        for (int i = 1; i < array.length; i++) {
            int number = i;
            int sum = i;
            while (number != 0) {
                sum = sum + (number % 10);
                number = number / 10;
            }
            if (sum <= 10000) {
                array[sum] = true;
            }
        }
        for (int i = 1; i < array.length; i++) {
            if (!array[i]) {
                System.out.println(i);
            }
        }
    }
}