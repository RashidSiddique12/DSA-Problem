//https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Strings/problem/repeating-character-first-appearance-leftmost

public class firstAppearanceLeftmost {

     //Function to find repeated character whose first appearance is leftmost.
     static int repeatedCharacter(String str)
     {
         // add your code here
         int n = str.length();
         for(int i=0; i<n; i++){
             char data = str.charAt(i);
             if(str.indexOf(data) != str.lastIndexOf(data)){
                 return i;
             }
             
         }
         return -1;
     }
    
}
