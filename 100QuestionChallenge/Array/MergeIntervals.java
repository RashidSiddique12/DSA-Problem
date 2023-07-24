import java.util.*;

public class MergeIntervals {

    public static int[][] mergIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int n = intervals.length;
        List<int[]> mergIntervals = new ArrayList<>();
        int[] currentInterval = intervals[0];
        mergIntervals.add(currentInterval);

        for (int i = 1; i < n; i++) {
            int[] interval = intervals[i];

            if (interval[0] <= currentInterval[1]) {
                currentInterval[1] = Math.max(currentInterval[1], interval[1]);
                mergIntervals.set(mergIntervals.size() - 1, currentInterval);
            } else {
                currentInterval = interval;
                mergIntervals.add(currentInterval);
            }
        }

        return mergIntervals.toArray(new int[mergIntervals.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };

        int[][] res = mergIntervals(intervals);
        for (int i = 0; i < res.length; i++) {
            System.out.print("[");
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + ",");
            }
            System.out.print("], ");
        }

    }
}
