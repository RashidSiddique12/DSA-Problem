//https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Hashing/problem/check-if-two-arrays-are-equal-or-not3847

import java.util.*;

class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
//         //Your code here
//     //     Arrays.sort(A);
//     //     Arrays.sort(B);
//     //     for(int i=0; i<A.length; i++){
//     //             if(A[i]!= B[i]) return false;
//     //         }
        
//     //     return true;
//     // }


    HashMap<Long, Integer> map = new HashMap<Long, Integer>();
    int count = 0;
    for(int i=0; i<N; i++){
        
        if(map.get(A[i])==null){
            map.put(A[i], 1);
        }
        else{
            count = map.get(A[i]);
            count++;
            map.put(A[i], count);
        }
        
    }
     for(int i=0; i<N; i++){
         if(!map.containsKey(B[i])) return false;
         if(map.get(B[i]) == 0) return false;
         
         count = map.get(B[i]);
         --count;
         map.put(B[i], count);
         
     }
     return true;

   }     
    
}