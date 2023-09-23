import java.util.*;

class LongestStringChain {
    public static int longestChain(String[] words) {

        Arrays.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        int ans = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            int longest = 0;
            for (int i = 0; i < word.length(); i++) {
                StringBuilder sub = new StringBuilder(word);
                sub.deleteCharAt(i);
                String subStr = sub.toString();
                longest = Math.max(longest, map.getOrDefault(subStr, 0) + 1);
            }
            map.put(word, longest);
            ans = Math.max(ans, longest);

        }
        return ans;
    }

    public static void main(String[] args) {
        String words[] = { "xbc", "pcxbcf", "xb", "cxbc", "pcxbc" };
        int res = longestChain(words);
        System.out.println(res);
    }

}