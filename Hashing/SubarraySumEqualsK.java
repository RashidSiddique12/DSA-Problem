//https://leetcode.com/problems/subarray-sum-equals-k/description/
import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0; 
        int pre_sum = 0; 
        map.put(0, 1);
        for(int i=0; i<nums.length; i++){
            pre_sum += nums[i];
            if(map.containsKey(pre_sum - k)){
                ans += map.get(pre_sum - k);
            }
            map.put(pre_sum, map.getOrDefault(pre_sum,0)+1);
        }
        return ans;
        
    }
}