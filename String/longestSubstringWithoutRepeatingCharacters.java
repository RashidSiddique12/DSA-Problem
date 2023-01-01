

//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

import java.util.*;
public class longestSubstringWithoutRepeatingCharacters{
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int max = 0;
        Set<Character> hs = new HashSet();
        while(right < s.length()){
            char c = s.charAt(right);
            if(hs.add(c)){
                max = Math.max(max, right-left+1);
                right++;
            }
            else{
                while(s.charAt(left) != c){
                    hs.remove(s.charAt(left));
                    left++;
                }
                hs.remove(c);
                left++;
            }
        }
        return max;
        
    }
}