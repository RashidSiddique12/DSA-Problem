class Solution {
    public void moveZeroes(int[] nums) {

        // int arr[] = new int[nums.length];
        int k=0;
    
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[k++]=nums[i];
            }
        }
            // if(){
                while(nums.length-1>=k){
                    nums[k++] = 0;
                }

            // }
        
    }
}