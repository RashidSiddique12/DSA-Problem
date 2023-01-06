
//https://leetcode.com/problems/find-the-duplicate-number/description/
import java.util.*;;

public class FindTheDuplicateNumber {

    public int findDuplicate(int[] nums) {

        Set<Integer> hs = new HashSet<>();
         int l = nums.length;
         for(int i=0; i<l; i++){
             if(hs.contains(nums[i])){
                 return nums[i];
             }
             else{
                 hs.add(nums[i]);
             }
         }
         return -1;
        
        
    }
}