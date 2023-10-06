public class IntegerBreak {

    public static int integerBreak(int n) {
        int[] memo = new int[n + 1];
        return maxProduct(n, memo);
    }

    public static int maxProduct(int n, int[] memo) {
        if (n <= 1)
            return 0;
        if (memo[n] != 0)
            return memo[n];

        int maxProductForN = 0;
        for (int i = 1; i < n; i++) {
            int currMaxProduct = Math.max(maxProduct(n - i, memo), n - i);
            maxProductForN = Math.max(maxProductForN, currMaxProduct * i);
        }

        memo[n] = maxProductForN;

        return maxProductForN;
    }

    public static void main(String[] args) {
        int n = 10;
        int res = integerBreak(n);
        System.out.println(res);
    }
}
