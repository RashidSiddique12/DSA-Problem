/**
 * The class `LongestParidromicSubString` finds the longest palindromic
 * substring in a given string.
 */
public class LongestParidromicSubString {

    /**
     * The function `findLongestPalidromic` takes a string `s` as input and returns
     * the longest
     * palindromic substring in `s`.
     * 
     * @param s The input string for which we want to find the longest palindromic
     *          substring.
     * @return The method is returning the longest palindromic substring found in
     *         the input string 's'.
     */
    public static String findLongestPalidromic(String s) {
        int n = s.length();
        int maxLength = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            int len1 = expandsFromCentre(s, i, i); // for odd
            int len2 = expandsFromCentre(s, i, i + 1); // for Even
            int len = Math.max(len1, len2);

            if (len > maxLength) {
                maxLength = len;
                start = i - (len - 1) / 2;
            }
        }
        return s.substring(start, start + maxLength);
    }

    public static int expandsFromCentre(String s, int i, int j) {

        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        return j - i - 1;
    }

    public static void main(String[] args) {

        String s = "forgeeksskeegfor";
        String str = findLongestPalidromic(s);
        System.out.println(str);
    }
}
