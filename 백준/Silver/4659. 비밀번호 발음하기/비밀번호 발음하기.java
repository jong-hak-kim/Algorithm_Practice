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
                // a, e, i, o, u 포함 여부
                if (str.contains("a") || str.contains("e") || str.contains("i") || str.contains("o")
                        || str.contains("u")) {
                    char[] charArray = str.toCharArray();
                    for (int j = 2; j < charArray.length; j++) {
                        if (charArray[j - 2] == 'a' || charArray[j - 2] == 'e' || charArray[j - 2] == 'i'
                                || charArray[j - 2] == 'o' || charArray[j - 2] == 'u') {
                            if (charArray[j - 1] == 'a' || charArray[j - 1] == 'e' || charArray[j - 1] == 'i'
                                    || charArray[j - 1] == 'o' || charArray[j - 1] == 'u') {
                                if (charArray[j] == 'a' || charArray[j] == 'e' || charArray[j] == 'i'
                                        || charArray[j] == 'o'
                                        || charArray[j] == 'u') {
                                    notAccept = true;
                                    break;
                                }
                            }
                        } else {
                            if (charArray[j - 1] != 'a' && charArray[j - 1] != 'e' && charArray[j - 1] != 'i'
                                    && charArray[j - 1] != 'o' && charArray[j - 1] != 'u') {
                                if (charArray[j] != 'a' && charArray[j] != 'e' && charArray[j] != 'i'
                                        && charArray[j] != 'o' && charArray[j] != 'u') {
                                    notAccept = true;
                                    break;
                                }
                            }
                        }
                    }
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
}