class MinimumOperationstoReduceXtoZero {
    public static int minimumOperation(int nums[], int x) {
        int totalSum = 0;
        int n = nums.length;
        for (int num : nums) {
            totalSum += num;
        }
        int target = totalSum - x;
        int currSum = 0;
        int maxLength = 0;
        int i = 0;
        for (int j = 0; j < n; j++) {
            currSum += nums[j];
            while (i <= j && target < currSum) {
                currSum -= nums[i];
                i++;
            }
            if (currSum == target) {
                maxLength = Math.max(maxLength, j - i + 1);
            }
        }
        return (maxLength != 0) ? n - maxLength : -1;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 20, 1, 1, 3 };
        int x = 10;
        int res = minimumOperation(nums, x);
        System.out.println(res);
    }
}