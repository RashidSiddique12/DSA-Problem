//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=study-plan&id=level-1

class Solution {
    public int maxProfit(int[] prices) {

        int max =0;
        int diff = 0;
        for(int i=0; i<prices.length -1; i++ ){
            diff += prices[i+1] - prices[i];
            if(diff <= 0){
                diff = 0;
            }
            if(diff >= max){
                max = diff;
            }
        }
                 
        
        return max;
        // int len = prices.length;
        // int profit = 0;
        // int res =0;
    
        // for(int i=0; i<len-1; i++){
        //     int max = prices[i];
        //     for(int j=i+1; j<len; j++){
        //         if(max < prices[j]){
        //             max = prices[j];
        //         }
        //         res = max - prices[i];
        //         if(profit < res){
        //             profit = res;
        //         }
                
        //     }
             
            
        // }
        // return profit;

        

        
    }
}