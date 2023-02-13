



//https://leetcode.com/problems/rotate-array/description/?envType=study-plan&id=algorithm-i



class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length; 
        // int arr[] = new int[nums.length];
        // int j=0;
        // for(int i=nums.length-k; i<nums.length; i++){
        //     arr[j++] = nums[i];
        // }
        
        // for(int i=0; i<nums.length-k; i++){
        //     arr[j++] = nums[i];
        // }

        // for(int i=0; i<nums.length; i++){
        //     nums[i] = arr[i];
        // }
        
        int len = nums.length;
        reverse(nums,len-k, len-1); //567
        reverse(nums, 0, len-1-k);
        reverse(nums, 0, len-1);

        


        
    }
    public static void reverse(int []nums, int i, int j){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    
}
