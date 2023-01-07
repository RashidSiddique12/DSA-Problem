
//https://leetcode.com/problems/single-number/description/
import java.util.*;
public class SingleNumber {
    
    public int singleNumber(int[] nums) {
        Map <Integer, Integer> hm = new HashMap<Integer, Integer> ();
        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i], hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> e : hm.entrySet()){
            if(e.getValue() == 1){
                return e.getKey();
            }
        }

        return -1;

//         class Solution {
//         public int singleNumber(int[] nums) {
//         int ans=0;
//         for(int i=0;i<nums.length;i++)
//             ans=ans^nums[i]; // 0^2 = 2^2 = 0^1 =1
//         return ans;          //0^4 = 4^1^2^1 = 4^2^2 = 4
//         }
//       }

        
    }
}