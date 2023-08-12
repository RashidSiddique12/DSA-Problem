public class PalindromicSubstrings {

    public static int palindromicSubstring(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String ss = s.substring(i, j);
                if (ss.length() > 1 && ispalindrommic(ss)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean ispalindrommic(String ss) {
        int i = 0;
        int j = ss.length() - 1;
        while (i <= j) {
            if (ss.charAt(i) != ss.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abaab";
        int res = palindromicSubstring(s);
        System.out.println(res);
    }
}
