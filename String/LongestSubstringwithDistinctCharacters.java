import java.util.*;
import java.io.*;
import java.lang.*;

public class LongestSubstringwithDistinctCharacters {
    
    static int longestDistinct(String str) 
    { 
        int res =0;
        int pre[] = new int[256];
        Arrays.fill(pre, -1);
        int i=0;
        for(int j=0; j<str.length(); j++){
            i = Math.max(i, pre[str.charAt(j)]+1);
            int maxEnd = j-i+1;
            res = Math.max(res, maxEnd);
            pre[str.charAt(j)] = j;
        }
	
	return res; 
    } 
    
    public static void main(String args[]) 
    { 
        String str = "abcabcdbc"; 
	    int len = longestDistinct(str);  
        System.out.print("The length of the longest distinct characters substring is "+ len); 
    } 
}