//중복 제거

import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int size = nums.length / 2;
        for(int num : nums){
            set.add(num);
        }
        
        return Math.min(size, set.size());
        
    }
}