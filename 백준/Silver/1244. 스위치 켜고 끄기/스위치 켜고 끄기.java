import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int switchCount = Integer.parseInt(bufferedReader.readLine());
        int[] switchState = new int[switchCount];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        // 배열에 값 집어넣기
        for (int i = 0; i < switchCount; i++) {
            int num = Integer.parseInt(stringTokenizer.nextToken());
            switchState[i] = num;
        }
        // 학생 수
        int studentCount = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < studentCount; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int manOrWoman = Integer.parseInt(stringTokenizer.nextToken());
            int switchNumber = Integer.parseInt(stringTokenizer.nextToken());
            if (manOrWoman == 1) {
                for (int j = 0; j < switchState.length; j++) {
                    if ((j + 1) % switchNumber == 0) {
                        if (switchState[j] == 1) {
                            switchState[j] = 0;
                        } else if (switchState[j] == 0) {
                            switchState[j] = 1;
                        }
                    }
                }
            } else if (manOrWoman == 2) {
                if (switchState[switchNumber - 1] == 0) {
                    switchState[switchNumber - 1] = 1;
                } else if (switchState[switchNumber - 1] == 1) {
                    switchState[switchNumber - 1] = 0;
                }

                for (int j = 1; j <= (switchCount / 2); j++) {
                    if ((switchNumber - j - 1) < 0 || (switchNumber + j - 1) >= switchCount) {
                        break;
                    } else if (switchState[switchNumber - j - 1] == switchState[switchNumber + j - 1]) {
                        if (switchState[switchNumber - j - 1] == 1) {
                            switchState[switchNumber - j - 1] = 0;
                            switchState[switchNumber + j - 1] = 0;
                        } else if (switchState[switchNumber - j - 1] == 0) {
                            switchState[switchNumber - j - 1] = 1;
                            switchState[switchNumber + j - 1] = 1;
                        }
                    } else {
                        break;
                    }
                }
            }
        }

        for (int i = 1; i <= switchState.length; i++) {
            System.out.print(switchState[i - 1] + " ");
            if (i % 20 == 0) {
                System.out.println();
            }
        }
    }
}