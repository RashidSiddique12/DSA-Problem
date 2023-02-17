//https://leetcode.com/problems/reverse-words-in-a-string-iii/description/?envType=study-plan&id=algorithm-i

class Solution {
    public String reverseWords(String s) {
        int lastSpaceIndex = -1;
        char[] sArray = s.toCharArray();
        int len = s.length();
        for(int i=0; i<=len; i++){
            if(i == len || sArray[i]==' '){
                int start = lastSpaceIndex +1;
                int end = i - 1;
                while(start < end){
                    char temp = sArray[start];
                    sArray[start] = sArray[end];
                    sArray[end] = temp;
                    end--;
                    start++;
                }
                lastSpaceIndex = i ;
            }
        }
        return new String(sArray);
        
    }
}