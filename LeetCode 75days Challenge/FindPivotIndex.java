//https://leetcode.com/problems/find-pivot-index/description/?envType=study-plan&id=level-1

// public class FindPivotIndex {
    
// }
class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum=0;
        int leftSum=0;
        for(int e:nums){
            totalSum += e;
        }
        for(int i=0; i<nums.length; i++){
         if(leftSum == (totalSum - nums[i])) return i;   
        
        else{
            leftSum += nums[i];
            totalSum -= nums[i]; 
        }
        }
        return -1;
        
    }
}