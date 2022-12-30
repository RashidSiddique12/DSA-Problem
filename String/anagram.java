//https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Strings/problem/anagram-1587115620


public class anagram 
{    static final int CHAR = 256;
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        int al = a.length();
        int bl = b.length();
        
        if(al!=bl) return false; // if length of both string is not equal then directy return false 
        int count[] = new int[CHAR]; // make length of 256 Array
        for(int i=0; i<al; i++){ // iterate each character
            count[a.charAt(i)]++; // each character increase if  found of string "a"
            count[b.charAt(i)]--; // each character decrease if found of string "b"
        }
        for(int i=0; i<CHAR; i++){ // if Array of count of index found not zero return false 
            if(count[i] != 0){
            return false;
        }
        }
        
        return true;
        
        
    }
}
    
