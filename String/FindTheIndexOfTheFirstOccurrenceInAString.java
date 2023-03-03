//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/


class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length()) return -1;
        for(int i=0; i<= haystack.length() - needle.length(); i++){
            int j=0;
            while(haystack.charAt(i+j) == needle.charAt(j)){
                j++;
                if(j == needle.length()) return i;
            }
        }
        return -1;
        //Using inbuilt function
        // return haystack.indexOf(needle);
        
    }
}