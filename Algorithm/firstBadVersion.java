///https://leetcode.com/problems/first-bad-version/description/?envType=study-plan&id=algorithm-i
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int l=1; 
            int h = n;
            while(l <= h){
                int mid = l+(h-l)/2;
                if(isBadVersion(mid)){
                        h = mid - 1;
                    // if(isBadVersion(mid - 1)){
                        // h = mid - 1;
                    // }
                    // else{
                    //     return mid;
                    // }
    
                }
                else{
                    l = mid + 1;
                }
            }
            return l;
            
        }
    }