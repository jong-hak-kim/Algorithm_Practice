import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] SpArray = splitArray(array, commands[i][0], commands[i][1]);
            Arrays.sort(SpArray);
            answer[i] = SpArray[commands[i][2] - 1];
        }

        return answer;
    }

    private static int[] splitArray(int[] array, int first, int last) {
        int indexI = first - 1;
        int indexJ = last - 1;
        int[] result = new int[last - first + 1];
        for (int i = indexI; i <= indexJ; i++) {
            result[i - indexI] = array[i];
        }

        return result;
    }
}