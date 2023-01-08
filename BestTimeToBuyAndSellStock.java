
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {

        int max=0;
        int count=0;
        for(int i=0;i<prices.length-1;i++){  
            count += prices[i+1] - prices[i];
            if(count <= 0){
                count = 0;
            }
            if(count >= max){
                max = count;
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