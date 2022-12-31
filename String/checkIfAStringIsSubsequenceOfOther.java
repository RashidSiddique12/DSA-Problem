//https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Strings/problem/given-two-strings-find-if-first-string-is-a-subsequence-of-second


class Solution
{
    //Function to check if a string is subsequence of other string.
    public static boolean isSubSequence(String A, String B)
    {
        //code here
        int j=0;
        int s = A.length();
        int b = B.length();
        for(int i=0; i<b && j<s; i++){
            if(B.charAt(i) == A.charAt(j)){
                j++;
            }
        }
        return j==s;
    }
};

// geeksforgeeks
// gksrek