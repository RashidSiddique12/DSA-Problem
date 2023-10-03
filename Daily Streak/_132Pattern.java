import java.util.*;

public class _132Pattern {

    public static boolean checkPattern(int nums[]) {
        Stack<Integer> st = new Stack<>();
        int third = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < third)
                return true;

            while (!st.isEmpty() && st.peek() < nums[i]) {
                third = st.pop();
            }
            st.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 1, 4, 2 };
        boolean res = checkPattern(nums);
        System.out.println(res);
    }
}
