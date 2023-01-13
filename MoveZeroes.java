

//https://leetcode.com/problems/move-zeroes/description/
public class MoveZeroes {

    public void moveZeroes(int[] nums) {

        // int arr[] = new int[nums.length];
        int k=0;
        int i=0;
        for(i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[k++]=nums[i];
            }
        }
            // if(){
                while(i-1>=k){
                    nums[k++] = 0;
                }

            // }
        
    }
}