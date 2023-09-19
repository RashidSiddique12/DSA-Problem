import java.util.*;

public class LengthOfTheLongestValidSubstring {
    public static int longestValidSubstring(String word, List<String> forbidden) {

        Set<String> set = new HashSet<>();
        int max = 0;
        for (String s : forbidden) {
            set.add(s);
            max = Math.max(max, s.length());
        }

        int ans = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            sb.append(ch + "");
            // System.out.println("sb after append => " + sb);
            int len = sb.length();
            for (int j = len - 1; j >= Math.max(0, len - max); j--) {
                String s = sb.substring(j);
                // System.out.println("s : substring => " + sb);
                if (set.contains(s)) {
                    sb.delete(0, j + 1);
                    // System.out.println("sb after delete => " + sb);
                    break;
                }
            }
            ans = Math.max(ans, sb.length());
        }
        return ans;
    }

    public static void main(String[] args) {
        String word = "cbaaaabc";
        List<String> forbidden = new ArrayList<>();
        forbidden.add("aaa");
        forbidden.add("cb");

        int res = longestValidSubstring(word, forbidden);
        System.out.println(res);

    }

}
