

//https://leetcode.com/problems/isomorphic-strings/description/


import java.util.*;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        Map <Character, Character> map1 = new HashMap<>();
        Map <Character, Boolean> map2 = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(map1.containsKey(ch1) == true){
                if(map1.get(ch1) != ch2){
                    return false;
                }
            }
            else{
                if(map2.containsKey(ch2) == true){
                    return false;
                }
                else{
                    map1.put(ch1, ch2);
                    map2.put(ch2, true);
                }
            }
        }
        return true;

        
    }
}


// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//         if(s.length()!=t.length())return false;
//        char alpha[]=new char[257];
//        boolean ar[]=new boolean[257];
//        char[] ss=s.toCharArray();
//        char[] tt=t.toCharArray();
//        for(int i=0;i<ss.length;i++){
//            if(alpha[tt[i]]==0 && ar[ss[i]]==false){
//                alpha[tt[i]]=ss[i];
//                ar[ss[i]]=true;
//            }else if(alpha[tt[i]]!=ss[i])return false;
//        }
//        return true;
//     }
// }