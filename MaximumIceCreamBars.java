
//https://leetcode.com/problems/maximum-ice-cream-bars/description/

import java.util.*;
public class MaximumIceCreamBars {
 
    public int maxIceCream(int[] costs, int coins) {

        int max = 0;
        int l = costs.length;
        Arrays.sort(costs);

        while(max < l && costs[max] <= coins){

            coins -= costs[max];
            max++;
        }

        
        return max;
        
    }
}