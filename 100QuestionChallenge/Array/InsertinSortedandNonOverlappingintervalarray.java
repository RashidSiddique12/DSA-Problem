import java.util.ArrayList;
import java.util.*;

public class InsertinSortedandNonOverlappingintervalarray {

    public static int[][] insert(int[][] intervals, int[] newIntervals) {
        List<int[]> result = new ArrayList<>();
        for (int[] in : intervals) {
            if (in[1] < newIntervals[0]) {
                result.add(in);
            } else if (newIntervals[1] < in[0]) {
                result.add(newIntervals);
                newIntervals = in;
            } else {
                newIntervals[0] = Math.min(newIntervals[0], in[0]);
                newIntervals[1] = Math.max(newIntervals[1], in[1]);
            }
        }
        result.add(newIntervals);
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 6, 9 } };
        int[] newIntervals = { 2, 5 };
        int[][] res = insert(intervals, newIntervals);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
        }

    }
}
