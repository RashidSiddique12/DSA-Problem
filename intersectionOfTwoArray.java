
//https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Hashing/problem/intersection-of-two-arrays2404
// User function Template for Java

class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        HashSet <Integer> hs = new HashSet<Integer> ();
        for(int i=0; i<n; i++){
            hs.add(a[i]);
            
        }
        int res=0;
        for(int i=0;i<m;i++){
            if(hs.contains(b[i])){
                res++;
                hs.remove(b[i]);
            }
        }
        return res;
        
    }
};
