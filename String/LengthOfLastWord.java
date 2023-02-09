//https://leetcode.com/problems/length-of-last-word/description/


class Solution {
    public int lengthOfLastWord(String s) {
        int l = s.length();
        int count =0;
        for(int i=l-1; i>=0; i--){
            char ch = s.charAt(i);
           
           if(ch != ' '){
               count++;
               if(i != 0 && s.charAt(i - 1) == ' '){
                   return count;
               }
           }
           
        }
        return count;
        
    }
}

//  public int lengthOfLastWord(String s) {
//         s=s.trim();
//         int c=0;
//         for(int i=0;i<s.length();i++)
//         {
//             if(s.charAt(i)==' ')
//                 c=0;
//             else
//                 c++;
//         }
//         return c;
//     }