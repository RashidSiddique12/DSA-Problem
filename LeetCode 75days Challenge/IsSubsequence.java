//https://leetcode.com/problems/is-subsequence/?envType=study-plan&id=level-1

// public class IsSubsequence {
    
// }

class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0;
        for(int i=0; i<t.length() && j<s.length(); i++){
            if(t.charAt(i) == s.charAt(j)){
                j++;
                if(j==s.length()) return true;
            }
        }

        return s.length() == j;
        
    }
}


//2nd Method to spilt string into Array
// class Solution {
//     public boolean isSubsequence(String s, String t) {
//        if (s.isEmpty() && t.isEmpty() || s.equals(t)) {
//             return true;
//         } else if (s.isEmpty()) {
//             return true;
//         } else if (t.isEmpty()) {
//             return false;
//         }
//         char[] firstString = s.toCharArray();
//         char[] secondString = t.toCharArray();
//         int counter = 0;
//         for (char c : secondString) {
//             if (c == firstString[counter]){
//                 counter++;
//                 if (counter == firstString.length){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }