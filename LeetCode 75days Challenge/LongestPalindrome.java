//https://leetcode.com/problems/longest-palindrome/description/?envType=study-plan&id=level-1



class Solution {
    public int longestPalindrome(String s) {

        int lowerCase[] = new int[26];
        int upperCase[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch - 97 >= 0) {
                lowerCase[ch - 97]++;
            } else {
                upperCase[ch - 65]++;
            }

        }

        int count = 0;
        boolean firstOdd = true;
        for (int i = 0; i < 26; i++) {

            if (lowerCase[i] % 2 == 0) {
                count += lowerCase[i];
            } else {
                if (firstOdd == true) {
                    count += lowerCase[i];
                    firstOdd = false;
                } else {
                    count += lowerCase[i] - 1;
                }

            }
        }

        for (int i = 0; i < 26; i++) {

            if (upperCase[i] % 2 == 0) {
                count += upperCase[i];
            } else {
                if (firstOdd == true) {
                    count += upperCase[i];
                    firstOdd = false;
                } else {
                    count += upperCase[i] - 1;
                }

            }
        }

        return count;

        // Using HashMap

        // Map <Character, Integer> map = new HashMap<>();
        // for(int i=0; i<s.length(); i++){
        // char ch = s.charAt(i);
        // map.put(ch, map.getOrDefault(ch, 0) + 1);
        // }
        // int count =0;
        // boolean firstOdd = true;
        // for(Map.Entry <Character, Integer> e : map.entrySet()){
        // if(e.getValue() % 2 == 0){
        // count += e.getValue();
        // }
        // else{
        // if(firstOdd == true){
        // count += e.getValue();
        // firstOdd = false;
        // }
        // else{
        // count += e.getValue() - 1;
        // }

        // }
        // }

        // return count;

    }
}
