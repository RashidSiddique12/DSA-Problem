//https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Hashing/problem/count-distinct-elements-1587115620

class Solution
{
    // arr[]: input array
    // n: size of array
    
    //Function to return the count of non-repeated elements in the array.
    static long countNonRepeated(int arr[], int n)
    {
        // add your code
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++){
             if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i]) + 1);
             }
             else{
                 hm.put(arr[i], 1);
             }
        }
        int res=0;
        for(Map.Entry<Integer, Integer> e : hm.entrySet()){
            if(e.getValue() == 1){
                res++;
            }
        }
        return res;
    }
}