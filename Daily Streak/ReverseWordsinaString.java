import java.util.Arrays;

public class ReverseWordsinaString {
    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";

        int j = str.length() - 1;
        StringBuilder sb = new StringBuilder();
        while (j >= 0) {
            sb.append(str.charAt(j));
            j--;

        }
        String newstr = sb.toString();
        String arr[] = newstr.split(" ");
        int k = 0, z = arr.length - 1;
        while (k < z) {
            String temp = arr[k];
            arr[k] = arr[z];
            arr[z] = arr[k];
            k++;
            z--;
        }

        StringBuilder newsb = new StringBuilder();
        for (String e : arr) {
            newsb.append(e + " ");
        }
        System.out.println(newsb.toString());
    }
}

// public class Solution {
// public String reverseWords(String s) {
// s = s.trim();
// char []chArr = s.toCharArray();
// int start = 0 ;
// // int end = 0;
// for(int i=0; i<chArr.length; i++){
// if(chArr[i] == ' ' ){
// swap(chArr, start, i - 1);
// start = i+1;
// }

// }
// swap(chArr, start, chArr.length - 1);

// return new String(chArr);

// }
// public void swap(char []chArr, int start, int end){
// while(start < end){
// char temp = chArr[start];
// chArr[start] = chArr[end];
// chArr[end] = temp;
// start++;
// end--;
// }
// }
// }