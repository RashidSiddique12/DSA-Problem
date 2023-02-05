//https://leetcode.com/problems/two-sum/description/?envType=study-plan&id=level-1

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
           int data = target - nums[i];
           if(map.containsKey(data)){
               return new int[] {map.get(data), i};
           }
           map.put(nums[i], i);
        }

        // for(int i=0; i<nums.length; i++){
        //     int data = target - nums[i];
        //     if(map.containsKey(data) && map.get(data) != i){
        //         int arr[] = new int[2];
        //         arr[0] = i;
        //         arr[1] = map.get(data);
        //         return arr;
        //     }
        // }
        return null;
        
    }
}