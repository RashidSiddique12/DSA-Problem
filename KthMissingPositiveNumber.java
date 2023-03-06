//https://leetcode.com/problems/kth-missing-positive-number/description/




class Solution {
    public int findKthPositive(int[] arr, int k) {

       
        int start =0;
        int end = arr.length;
        while(start<end){
            int mid = start+(end-start)/2;
             if(arr[mid]-(mid+1)>=k){
                 end = mid;
             } else {
                 start = mid+1;
             }
        }
        return start+k;
   


//Not a good Apporch
        // ArrayList <Integer> list = new ArrayList<>();
        // int j=1;
        // int i=0;
        // while(list.size() < k){
        //     if(i < arr.length){
        //         if(arr[i] != j){
        //             list.add(j);
        //             j++;
        //         }
        //         else if(arr[i] == j){
        //             i++;
        //             j++;
        //         }
        //     }
        //     else{
        //         list.add(j);
        //         j++;
        //     }
        // }
        // for(int z=0; z<list.size(); z++){
        //     if(z  == k - 1){
        //         return list.get(z);
        //     }
        // }
        // return -1;
    }
}