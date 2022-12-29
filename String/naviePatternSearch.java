package String;

//https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Strings/problem/naive-pattern-search-1587115620

public class naviePatternSearch {

     //Function to check if the given pattern exists in the given string or not.
     static boolean search(String pat, String txt)
     {
             // Your code here
             int n = pat.length(); // aaba
             int m = txt.length(); // bcaabada
             
             for(int i=0; i<= m-n; i++){
                 int j=0;
                 for(j=0; j<n; j++){
                     if(txt.charAt(i + j) != pat.charAt(j)){
                         break;
                     }
                 }
                     if(j==n){
                        // arr.add(i);// if you want to store every index of "txt" where pattern  match then use ArrayList to sstore the index
                         return true;
                     }
             }
             return false;
             
     }
    
}
