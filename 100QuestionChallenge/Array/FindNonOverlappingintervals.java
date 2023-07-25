import java.util.Arrays;

public class FindNonOverlappingintervals {

    public static int[] findNonOverlappingInterval(int[][] intervals) {
        int n = intervals.length;

        // Sort the intervals based on their start times
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int currentEnd = intervals[0][1];

        for (int i = 1; i < n; i++) {
            int[] interval = intervals[i];

            // If the current interval overlaps with the previous one
            if (interval[0] <= currentEnd) {
                // Update the currentEnd to be the maximum end time seen so far
                currentEnd = Math.max(currentEnd, interval[1]);
            } else {
                // If the current interval does not overlap with the previous one
                // Return the non-overlapping interval [currentEnd, interval[0]]
                return new int[] { currentEnd, interval[0] };
            }
        }

        // If there's only one interval or all intervals overlap, return null
        return null;
    }

    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 2, 4 }, { 3, 5 }, { 7, 9 } };
        int[] res = findNonOverlappingInterval(intervals);

        if (res != null) {
            System.out.println("[" + res[0] + ", " + res[1] + "]");
        } else {
            System.out.println("No non-overlapping interval found.");
        }
    }
}
