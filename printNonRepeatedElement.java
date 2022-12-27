

//https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Hashing/problem/print-distinct-elements-1587115620
//User function Template for Java

class Solution
{
    //Function to return non-repeated elements in the array.
    static ArrayList<Integer> printNonRepeated(int arr[], int n)
    {
        // add your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
         LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<Integer, Integer>();
        for(int i=0; i<n; i++){
             if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i]) + 1);
             }
             else{
                 hm.put(arr[i], 1);
             }
        }
        
        for(Map.Entry<Integer, Integer> e : hm.entrySet()){
            if(e.getValue() == 1){
                list.add(e.getKey());
            }
        }
        return list;
    }
}