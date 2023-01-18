
//https://leetcode.com/problems/4sum-ii/description/

import java.util.*;
public class _4SumII {

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count =0;
        for(int e1 : nums1){
            for(int e2 : nums2){
                map.put(e1+e2, map.getOrDefault(e1+e2, 0)+1);
            }
        }

        //I make 4 arrays into 2 array so time & space reduced and compare with second one
        int target = 0;
        for(int e1 : nums3){
            for(int e2 : nums4){
                count +=map.getOrDefault(target-(e1+e2),0); // (nums1+nums2) + (nums3+nums4) == 0 =>target
            }                                               // (nums1+nums2)= target -  (nums3+nums4) also equal
        }

        return count;

        
    }
}