import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ChocolateDistributionProblem {

    public static int minDifference(List<Integer> a, int n, int m) {
        Collections.sort(a);
        int min_Diff = Integer.MAX_VALUE;
        for (int i = 0; i + m - 1 < n; i++) {
            if (min_Diff > a.get(i + m - 1) - a.get(i)) {
                min_Diff = a.get(i + m - 1) - a.get(i);
            }
        }
        return min_Diff;
    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(7, 3, 2, 4, 9, 12, 56);
        int n = 7;
        int m = 3;
        int res = minDifference(a, n, m);
        System.out.println(res);
    }
}
