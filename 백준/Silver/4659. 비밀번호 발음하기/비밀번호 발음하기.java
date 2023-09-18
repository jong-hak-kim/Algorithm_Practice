import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            String str = bufferedReader.readLine();
            if (str.equals("end")) {
                break;
            } else {
                boolean notAccept = false;
                // a, e, i, o, u 포함 여 확인
                if (str.contains("a") || str.contains("e") || str.contains("i") || str.contains("o")
                        || str.contains("u")) {
                    char[] charArray = str.toCharArray();

                    // 3개 연속 여부 확인
                    for (int j = 2; j < charArray.length; j++) {
                        if (isVowel(charArray[j - 2])) {
                            if (isVowel(charArray[j - 1])) {
                                if (isVowel(charArray[j])) {
                                    notAccept = true;
                                    break;
                                }
                            }
                        } else {
                            if (!isVowel(charArray[j - 1])) {
                                if (!isVowel(charArray[j])) {
                                    notAccept = true;
                                    break;
                                }
                            }
                        }
                    }

                    // 글자 연속 두 번 확인(ee, oo 허용)
                    for (int j = 1; j < charArray.length; j++) {
                        if (charArray[j - 1] == charArray[j]) {
                            if (!(charArray[j] == 'e' || charArray[j] == 'o')) {
                                notAccept = true;
                                break;
                            }
                        }
                    }
                } else {
                    notAccept = true;
                }
                if (notAccept) {
                    stringBuilder.append("<" + str + "> is not acceptable.").append("\n");
                } else {
                    stringBuilder.append("<" + str + "> is acceptable.").append("\n");
                }
            }
        }

        System.out.println(stringBuilder);
    }

    // 모음 확인
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }
}