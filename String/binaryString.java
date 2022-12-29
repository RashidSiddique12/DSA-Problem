//https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Strings/problem/binary-string-1587115620

class Solution
{
    //Function to count the number of substrings that start and end with 1.
    public static int binarySubstring(int a, String str)
    {
        // Your code here
        int count=0;
        for(int i=0; i<a; i++){
            if(str.charAt(i) == '1'){
                count++;
            }
        }
        return (count*(count-1))/2; 
    }
}

// 1111
// count = 4;
// return 4*3/2 = 6
