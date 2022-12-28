//https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Hashing/problem/hashing-for-pair-2

class Geeks {
    // Complete this function
    // Function to check if two numbers in array have sum equal to the given
    // sum.
    public static int sumExists(int arr[], int N, int sum) {

        // Your code here
         HashSet <Integer> hs = new HashSet<Integer>();
        // pre_sum = 0;
        // hs.add(0);
        for(int i=0; i<N; i++){
            hs.add(arr[i]);
        }
        int res =0;
        for(int i=0; i<N; i++){
            int data = sum - arr[i];
            if(hs.contains(data)){
                if(data != arr[i]){
                    res++;
                }
                
            }
        }
        if(res >= 2) return 1;
        return 0;
    }
}
