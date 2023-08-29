import java.util.*;

class NextGreaterElement {

    public static int[] nextGreater(int nums1[], int nums2[]) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < nums2.length; i++) {
            while (!st.isEmpty() && st.peek() < nums2[i]) {
                map.put(st.pop(), nums2[i]);
            }
            st.push(nums2[i]);
        }
        int res[] = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.getOrDefault(nums1[i], -1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = { 2, 4 };
        int[] nums2 = { 1, 2, 3, 4 };
        int res[] = nextGreater(nums1, nums2);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
