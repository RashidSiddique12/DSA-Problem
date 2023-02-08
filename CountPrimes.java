//https://leetcode.com/problems/count-primes/description/

// public class CountPrimes {
    
// }



class Solution {
    public int countPrimes(int n) {
//sieve algorithm
        int count =0;
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime, true);
        for(int i=2; i*i <=n; i++){
            if(isPrime[i]){
                for(int j=2*i; j<=n; j +=i){
                    isPrime[j] = false;
                }
            }
        }

        for(int i=2; i<n; i++){
            if(isPrime[i]){
                count++;
            }
        }
        return count;
        
        
    }
}
        // int count = 0;
        // for(int i=2; i<n; i++){
        //      if(i==2) {
        //          count++;
        //          continue;
        //      }

        //     int p =(int)Math.pow(2, i-1)%i;
        //     if(p==1){
        //         count++;
        //     }

            

        // }
        // return count;