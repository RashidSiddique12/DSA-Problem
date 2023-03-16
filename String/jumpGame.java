//https://leetcode.com/problems/jump-game/description/


package String;

public class jumpGame {
    
    public boolean canJump(int[] nums) {

        int n = nums.length;
        if(n==1) return true;
        int index = n-1;
        for(int i=n-1; i>=0; i--){
            if(nums[i] + i>=  index){
                index = i;
            }

        }
        return (index == 0);



        // if(n==0 || n==1) return true;
        

        // for(int i=0; i<n-1; i++){
        //     if(nums[i] == 0) return false;
        //     if(nums[i] + i == n-1) return true;
        //     else{
        //         for(int j=0; j<=nums[i]; j++){
        //             if(j == n-1) return true;
        //             // if(nums[j] == 0) return false;
        //         }
        //     }

        // }
        // return false;
        
    }
}