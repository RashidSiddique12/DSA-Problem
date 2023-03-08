//https://leetcode.com/problems/minimum-time-to-complete-trips/description/

class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long low = 1;
        long high = Long.MAX_VALUE;
        while(low <= high){
            long minTime = 0;
            long mid = low + (high - low)/2;
            for(int t : time){
                minTime += mid/t;
                if(minTime >= totalTrips){
                    high = mid - 1;
                    break;
                }
            }
            if (minTime < totalTrips){
                low = mid + 1;
            }

        }
    return low;
    }
}
