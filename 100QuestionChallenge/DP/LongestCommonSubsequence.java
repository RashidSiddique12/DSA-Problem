
public class LongestCommonSubsequence {

    static int dp[][];

    ////
    public static int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        dp = new int[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j] = -1;
            }
        }

        return lcs(text1, text2, n, m);
    }

    public static int lcs(String text1, String text2, int n, int m) {

        if (dp[n][m] != -1) {
            return dp[n][m];
        }
        if (n == 0 || m == 0) {
            dp[n][m] = 0;
        } else {
            if (text1.charAt(n - 1) == text2.charAt(m - 1)) {
                dp[n][m] = 1 + lcs(text1, text2, n - 1, m - 1);
            } else {
                dp[n][m] = Math.max(lcs(text1, text2, n - 1, m), lcs(text1, text2, n, m - 1));
            }
        }

        return dp[n][m];

    }

    ////

    public static void main(String[] args) {

        String s1 = "abcde";
        String s2 = "abce";

        int res = longestCommonSubsequence(s1, s2);
        System.out.println(res);
    }
}
