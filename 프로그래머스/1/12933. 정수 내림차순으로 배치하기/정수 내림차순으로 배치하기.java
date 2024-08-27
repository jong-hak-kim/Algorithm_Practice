import java.util.Arrays;

class Solution {
    public long solution(long n) {
      String num = Long.toString(n);
        char[] numWord = num.toCharArray();
        Arrays.sort(numWord);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numWord.length; i++) {
            stringBuilder.append(numWord[i]);
        }

        stringBuilder.reverse();
        return Long.parseLong(stringBuilder.toString());
    }
}