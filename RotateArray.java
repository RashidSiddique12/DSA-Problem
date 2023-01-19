
//https://leetcode.com/problems/rotate-array/description/


public class RotateArray {
    
    public void rotate(int[] nums, int k) {
        k = k%nums.length; 
        int arr[] = new int[nums.length];
        int j=0;
        for(int i=nums.length-k; i<nums.length; i++){
            arr[j++] = nums[i];
        }
        
        for(int i=0; i<nums.length-k; i++){
            arr[j++] = nums[i];
        }

        for(int i=0; i<nums.length; i++){
            nums[i] = arr[i];
        }
        
    }
    
}