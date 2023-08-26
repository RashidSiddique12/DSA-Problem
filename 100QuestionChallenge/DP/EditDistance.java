public class EditDistance {

    public static int editDistance(String s, String t) {
        // Code here
        int m = s.length(); // s = initial
        int n = t.length(); // t = to make

        int dp[][] = new int[m + 1][n + 1];
        // now fill first row and first coloum,
        // like for first row => if m== 0, then fill in row, size of n
        // similar for first coloum => if n= 0, then fill in coloum, size of m

        for (int i = 0; i <= n; i++) {
            dp[0][i] = i;
        }
        for (int j = 0; j <= m; j++) {
            dp[j][0] = j;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]);
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        String s = "geek";
        String t = "gesek";
        int res = editDistance(s, t);
        System.out.println(res);
    }
}
