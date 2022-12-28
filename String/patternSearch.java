package String;
//https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Strings/problem/distinct-pattern-search-1587115620

public class patternSearch {
     //Function to check if the given pattern exists in the given string or not.
     static boolean search(String pat, String txt)
     {
         // Your code here
         if(txt.contains(pat)) return true;
         
         else {
          return false;
         }
         
     }
}
