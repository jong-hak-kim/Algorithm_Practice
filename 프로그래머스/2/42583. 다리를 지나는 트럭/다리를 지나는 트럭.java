//큐 = 다리
    // 다리 건너는 경우
        // 큐가 비어있을 경우
        // 큐가 가득차지 않은 경우
        // 큐가 가득찬 경우

import java.util.ArrayDeque;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int weightSum = 0;
        int time = 0;
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for(int i = 0; i < truck_weights.length; i++) {
            int truck = truck_weights[i];
            while(true){
                if(queue.isEmpty()){
                    queue.addLast(truck);
                    weightSum += truck;
                    time++;
                    break;
                } else if(queue.size() == bridge_length){
                    weightSum -= queue.pollFirst();
                } else {
                    if(weightSum + truck <= weight){
                        queue.addLast(truck);
                        weightSum += truck;
                        time++;
                        break;
                    } else {
                        queue.addLast(0);
                        time++;
                    }
                }
            }
        }
        
        return time + bridge_length;
    }
}