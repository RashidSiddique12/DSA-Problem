import java.util.*;

class LongestRepeatingCharacterReplacement {

    public static int longestRepeating(String s, int k) {
        int maxLength = 0;
        int maxFreq = 0;
        int start = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int end = 0; end < s.length(); end++) {
            char rightChar = s.charAt(end);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(rightChar));

            // if Window size is not valid
            if (end - start + 1 - maxFreq > k) {
                map.put(s.charAt(start), map.getOrDefault(s.charAt(start), 0) - 1);
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;

    }

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        int res = longestRepeating(s, k);
        System.out.println(res);
    }
}