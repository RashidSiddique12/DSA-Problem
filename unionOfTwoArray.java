//https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Hashing/problem/union-of-two-arrays3538
//User function Template for Java

class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0; i<n; i++){
            hs.add(a[i]);
        }
        for(int i=0; i<m; i++){
            hs.add(b[i]);
        }
        return hs.size();
    }
}