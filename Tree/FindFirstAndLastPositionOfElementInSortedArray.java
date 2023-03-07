//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

class Solution {

    public int index(int[] nums, int target, boolean occ){
        int low = 0;
        int high = nums.length - 1;
        int index = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid]== target){
                if(occ == true){
                    index = mid;
                    high = mid -1;
                }else{
                    index = mid;
                    low = mid +1;
                }
                
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return index;
    }

    public int[] searchRange(int[] nums, int target) {
//Second Method
        int first = index(nums, target, true);
        int last = index(nums, target, false);

        return new int[]{first, last};


// 1st method
        // int low = 0;
        // int high = nums.length - 1;
        // int start;
        // int end;
        // while(low <= high){
        //     int mid = low + (high-low)/2;
        //     if(nums[mid]== target){
        //         int i=mid - 1;
        //         while(i >= 0 && nums[i] == target ){
        //             i--;
        //         }
        //         start = i + 1;
        //         int j=mid +1;
        //         while(j < nums.length  && nums[j] == target){
        //             j++;
        //         }
        //         end = j - 1;

        //         return new int[]{start, end};
        //     }
        //     else if(nums[mid] > target){
        //         high = mid - 1;
        //     }
        //     else{
        //         low = mid + 1;
        //     }
        // }
        // return new int[]{-1, -1};
    }
}