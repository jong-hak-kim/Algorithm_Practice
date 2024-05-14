// prices 반복문으로 순회
    // 인덱스 0은 초기값이므로 스택에 바로 넣기
    // 스택 top에 있는 인덱스 값과 배열을 도는 인덱스값과 비교
    // top값이 작으면 스택에 인덱스값 넣기
    // top이 크면 가격이 떨어진 것이므로 [현재 순회하는 i - top]을 하면 가격이 떨어진 시간이 나온다
    // 결과 배열에 저장
    // 순회 종료 후 스택에 인덱스가 남아있다면 가격이 한번도 떨어지지 않은 값이므로 [마지막 인덱스 - 스택에 남은 인덱스]를 하면 최종 길이가 나온다
    // 배열에 저자 

import java.util.ArrayDeque;

class Solution {
    public int[] solution(int[] prices) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int length = prices.length;
        int[] result = new int[length];
        stack.push(0);
        
        for(int i = 1; i < length; i++){
            while(!stack.isEmpty() && prices[i] < prices[stack.peek()]){
                int index = stack.pop();
                result[index] = i - index;
            }
            stack.push(i);
        }
        
        while(!stack.isEmpty()){
            int lastIndex = stack.pop();
            result[lastIndex] = length - 1 - lastIndex;
        }
        
        return result;
    }
}