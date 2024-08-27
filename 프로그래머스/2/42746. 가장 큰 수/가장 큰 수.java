import java.util.Arrays;

//붙여서 숫자 비교
class Solution {
    public String solution(int[] numbers) {
         String[] arr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(arr, (o1, o2) ->
                {
                    int a = Integer.parseInt(o1 + o2);
                    int b = Integer.parseInt(o2 + o1);
                    return Integer.compare(b, a);
                }
        );
        

        StringBuilder stringBuilder = new StringBuilder();
        for (String num : arr) {
            stringBuilder.append(num);
        }

        return stringBuilder.charAt(0) == '0' ? "0" : stringBuilder.toString();
    }
}