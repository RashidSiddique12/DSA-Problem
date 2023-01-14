package Sorting;
//https://leetcode.com/problems/majority-element/description/

import java.util.*;
public class MajorityElement {
    public int majorityElement(int[] nums) {

        Arrays.sort(nums);
        return nums[nums.length / 2];
        // After sorting , the element appears more than n/2 times , then element always
        // come in middle arrays so i return middle element

    }
}