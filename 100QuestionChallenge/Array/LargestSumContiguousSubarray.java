
//Kadane's Algorithm

public class LargestSumContiguousSubarray {

    public static long largestSumContiguousSubarray(int[] arr) {
        long max = Integer.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        long result = largestSumContiguousSubarray(arr);
        System.out.println(result);

    }
}
