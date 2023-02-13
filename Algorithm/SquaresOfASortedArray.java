
//https://leetcode.com/problems/squares-of-a-sorted-array/description/

class Solution {
    public int[] sortedSquares(int[] nums) {

        //two pointer apporach
        int n = nums.length;
        int i=0, j= n-1;// here two pointer i and j
        int result[] = new int[n];
        for(int t= n-1; t>=0; t--){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){ // agar 'i' index greater hai to iska sqaure karke result ke last p chipka do
                result[t] = nums[i] * nums[i];
                i++;
            }
            else{
                result[t] = nums[j] * nums[j]; // nhi to isko
                j--;
            }
        }
        
        return result;
        
    }
}