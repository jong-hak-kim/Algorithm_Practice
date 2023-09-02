import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean[] array = new boolean[10001];
        for (int i = 1; i < array.length; i++) {
            int num = 0;
            if (i < 10) {
                num = i + i;
                array[num] = true;
            } else if (i < 100) {
                num = i + (i / 10) + (i % 10);
                array[num] = true;
            } else if (i < 1000) {
                num = i + (i / 100) + ((i % 100) / 10) + (i % 10);
                array[num] = true;
            } else if (i < 10000) {
                num = i + (i / 1000) + ((i % 1000) / 100) + ((i % 100) / 10) + (i % 10);
                if (num > 10000) {
                    continue;
                } else {
                    array[num] = true;
                }
            }
        }
        for (int i = 1; i < array.length; i++) {
            if (!array[i]) {
                System.out.println(i);
            }
        }
    }
}