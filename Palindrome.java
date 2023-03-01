//https://leetcode.com/problems/palindrome-number/description/


class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;

        }
        // String temp = Integer.toString(x);
        // int[] newarr = new int[temp.length()];
        // for (int i = 0; i < temp.length(); i++)
        // {
        //     newarr[i] = temp.charAt(i) ;
        // }
        
         int len =0;
         int num = x;
         while(num>0){
             num = num/10;
             len++ ;
         }
        int newarr[] = new int[len];
        for(int i=0; i<len; i++ ){
            newarr[i] = x%10;
            x= x/10; 
        }
       int left=0;
       int right=newarr.length-1;
        while(left<=right){
            
            if(newarr[left] == newarr[right]){
                left++;
                right--;
            }
            else
            {
                return false;
            }
            
        }
        return true;
        
    }
}