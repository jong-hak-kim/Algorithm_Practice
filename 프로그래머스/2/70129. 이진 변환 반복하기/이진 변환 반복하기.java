class Solution {
    public int[] solution(String s) {
        int sum = 0;
        int replaceCount = 0;

        while (!s.equals("1")) {
            int zeroCount = s.replace("1", "").length();
            replaceCount += zeroCount;
            sum++;

            s = Integer.toBinaryString(s.length() - zeroCount);
        }

        return new int[]{sum, replaceCount};
        
        
    }
}