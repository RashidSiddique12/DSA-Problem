import java.util.*;

public class MajorityElementII {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums.length == 0)
            return res;
        if (nums.length < nums.length / 3) {
            for (int num : nums) {
                res.add(num);
            }
            return res;
        }

        int candidate1 = 0, candidate2 = 0, count1 = 0, count2 = 0;
        for (int num : nums) {
            if (candidate1 == num) {
                count1++;
            } else if (candidate2 == num) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = count2 = 0;
        for (int num : nums) {
            if (num == candidate1)
                count1++;
            else if (num == candidate2)
                count2++;
        }

        int val = nums.length / 3;
        if (count1 > val)
            res.add(candidate1);
        if (count2 > val)
            res.add(candidate2);

        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 3, 5, 5 };
        List<Integer> res = majorityElement(nums);
        System.out.println(res);
    }
}
