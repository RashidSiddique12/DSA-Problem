
//https://leetcode.com/problems/missing-number/

import java.util.*;
public class MissingNumber {

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        for(i=0; i<nums.length; i++){
            if(nums[i] != i) return i;
        }

        return i;






        // Set<Integer> hs = new HashSet<>();
        // int l = nums.length;
        // for(int i =1; i<=l; i++){
        //     hs.add(i);
        // }
        // for(int i=0; i<l; i++){
        //     if(hs.contains(nums[i])){
        //         hs.remove(nums[i]);
        //     }
        // }

        //  for(int i =1; i<=l; i++){
        //     if(hs.contains(i)) {
                
        //         return i;
        //     }
        // }

        // return 0;
        
    }
}