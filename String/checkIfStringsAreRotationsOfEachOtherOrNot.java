
//https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Strings/problem/check-if-strings-are-rotations-of-each-other-or-not-1587115620



public class checkIfStringsAreRotationsOfEachOtherOrNot {
        //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {
        // Your code here
        if(s1.length() != s2.length()) return false;
         if((s1+s1).contains(s2)) return true;
         
         return false;
    }
    
}