import java.util.HashSet;

public class LengthoftheLongestsubstringwithoutRepeatingCharacters {

    public static int longestSubString(String str) {
        int i = 0;
        int j = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        while (i < str.length()) {
            char ch = str.charAt(i);
            if (set.add(ch)) {
                max = Math.max(max, i - j + 1);
                i++;
            } else {
                while (str.charAt(j) != ch) {
                    set.remove(str.charAt(j));
                    j++;
                }
                set.remove(str.charAt(j));
                j++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        int res = longestSubString(str);
        System.out.println(res);
    }
}
