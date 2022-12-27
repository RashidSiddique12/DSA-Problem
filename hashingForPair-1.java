
//https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Hashing/problem/hashing-for-pair-1
// User function Template for Java

class Geeks {
    // Complete this function
    // Function to check if there is a pair with the given sum in the array.
    public static int sumExists(int arr[], int N, int sum) {
        // Your code here, Geeks
        HashSet <Integer> hs = new HashSet<Integer>();
        // pre_sum = 0;
        // hs.add(0);
        for(int i=0; i<N; i++){
            hs.add(arr[i]);
        }
        for(int i=0; i<N; i++){
            int data = sum - arr[i];
            if(hs.contains(data)){
                if(data != arr[i]){
                    return 1;
                }
                
            }
        }
        return 0;
        
    }
}