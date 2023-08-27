import java.util.*;

public class MaximumLengthofPairChain {

    public static int maxPairChain(int[][] pairs) {
        // dp method TC- O(n^2)
        // Arrays.sort(pairs, (a, b) -> (a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]));
        // int n = pairs.length;
        // int dp[] = new int[n];
        // Arrays.fill(dp, 1);

        // for (int i = 1; i < n; i++) {
        // int p2[] = pairs[i];
        // for (int j = 0; j < i; j++) {
        // int p1[] = pairs[j];
        // if (p2[0] > p1[1]) {
        // dp[i] = Math.max(dp[i], dp[j] + 1);
        // }
        // }
        // }

        // int longest = 0;
        // for (int i = 0; i < n; i++) {
        // longest = Math.max(longest, dp[i]);
        // }

        // return longest;

        /////////// other method TC- O(nlogn)///////////
        Arrays.sort(pairs, (a, b) -> (a[1] - b[1]));
        int n = pairs.length;
        int prev = 0;
        int res = 1;
        for (int i = 1; i < n; i++) {
            if (pairs[i][0] > pairs[prev][1]) {
                prev = i;
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[][] pairs = { { 1, 2 }, { 7, 8 }, { 4, 5 } };
        int res = maxPairChain(pairs);
        System.out.println(res);

        // Scanner sc = new Scanner(System.in);
        // System.err.println("Entre Length of pair");
        // int n = sc.nextInt();
        // int pairs[][] = new int[n][2];
        // for (int i = 0; i < n; i++) {
        // pairs[i][0] = sc.nextInt();
        // pairs[i][1] = sc.nextInt();
        // }

        // // printting
        // for (int i = 0; i < n; i++) {
        // System.out.println(pairs[i][0] + " " + pairs[i][1]);
        // }

        // // Sorting the pairs acc to first value if first value is same then we go for
        // // the second value;;
        // // Arrays.sort(pairs, (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        // Arrays.sort(pairs, (a, b) -> a[1] - b[1]);

        // System.out.println("After sorting");
        // for (int i = 0; i < n; i++) {
        // System.out.println(pairs[i][0] + " " + pairs[i][1]);
        // }
    }
}
