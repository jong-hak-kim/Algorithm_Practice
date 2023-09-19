import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int N = Integer.parseInt(bufferedReader.readLine());
        boolean heart = false;
        boolean leftArm = false;
        boolean[][] tray = new boolean[N][N];
        int rightArm = 0;
        int waist = 0;
        int leftLeg = 0;
        int rightLeg = 0;
        for (int i = 0; i < tray.length; i++) {
            String row = bufferedReader.readLine();
            for (int j = 0; j < tray.length; j++) {
                if (row.charAt(j) == '*') {
                    tray[i][j] = true;
                }
            }
        }

        loop: for (int i = 0; i < tray.length; i++) {
            for (int j = 0; j < tray.length; j++) {
                // 심장 좌표 구하기
                if (tray[i][j] == true && heart == false) {
                    stringBuilder.append((i + 2) + " " + (j + 1) + "\n");
                    heart = true;
                    // 왼쪽 팔, 오른쪽 팔 길이 구하기
                    for (int j2 = 0; j2 < tray.length; j2++) {
                        if (tray[i + 1][j2] == true && leftArm == false) {
                            stringBuilder.append(j - j2 + " ");
                            leftArm = true;
                        }
                        if (leftArm == true && tray[i + 1][j2] == true) {
                            rightArm = j2;
                        }
                    }
                    stringBuilder.append(rightArm - j + " ");
                    // 허리 길이 구하기
                    for (int i2 = i + 2; i2 < tray.length; i2++) {
                        if (tray[i2][j]) {
                            waist = i2;
                        }
                    }
                    stringBuilder.append(waist - (i + 1) + " ");
                    // 왼쪽 다리, 오른쪽 다리 길이 구하기
                    for (int i2 = waist + 1; i2 < tray.length; i2++) {
                        if (tray[i2][j - 1]) {
                            leftLeg = i2;
                        }
                        if (tray[i2][j + 1]) {
                            rightLeg = i2;
                        }
                    }
                    stringBuilder.append((leftLeg - waist) + " " + (rightLeg - waist));
                    break loop;
                }
            }
        }
        System.out.println(stringBuilder);
    }

}