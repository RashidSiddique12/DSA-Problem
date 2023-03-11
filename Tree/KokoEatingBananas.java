// /https://leetcode.com/problems/koko-eating-bananas/description/

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max =Integer.MIN_VALUE;
        for(int v : piles){
            max = Math.max(max, v);
        }
        if(h == piles.length){return max;}
        int low =0;
        int high = max;
        int k = Integer.MAX_VALUE;
        while(low <= high){
            int mid = low + (high-low)/2;
            // System.out.println("Mid is " + mid);
            if(isPossible(piles, h, mid) == true){
                k = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return k;
        
    }

    public boolean isPossible(int[] piles, int h, int mid){
        int time =0;
        for(int i =0; i< piles.length; i++){
            time+= Math.ceil((double)piles[i]/mid);
            
            
        }
        
        return time <= h;
    }

}