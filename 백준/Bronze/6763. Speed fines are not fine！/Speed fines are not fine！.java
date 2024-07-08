import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int limit = Integer.parseInt(bufferedReader.readLine());
        int speed = Integer.parseInt(bufferedReader.readLine());
        int overSpeed = 0;
        int fine = 0;

        if (limit >= speed) {
            System.out.println("Congratulations, you are within the speed limit!");
        } else {
            overSpeed = speed - limit;
            if (overSpeed >= 31) {
                fine = 500;
            } else if (overSpeed >= 21) {
                fine = 270;
            } else if (overSpeed >= 1) {
                fine = 100;
            }

            System.out.println("You are speeding and your fine is $" + fine + ".");
        }
    }
}