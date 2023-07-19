
public class MaximumProductSubarray {

    // better approch 0(n) using prefix and suffix
    public static int maxproductt(int[] arr) {

        int prefix = 1;
        int suffix = 1;
        int max = Integer.MIN_VALUE;
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            prefix *= arr[i];
            suffix *= arr[n - 1 - i];
            max = Math.max(max, Math.max(prefix, suffix));

            if (arr[i] == 0) {
                prefix = 1;
            }
            if (arr[n - 1 - i] == 0) {
                suffix = 1;
            }
        }
        return max;
    }

    public static int maxproduct(int[] arr) {
        int n = arr.length;
        int result = arr[0];
        for (int i = 0; i < n; i++) {
            int mul = arr[i];
            for (int j = i + 1; j < n; j++) {
                result = Math.max(result, mul);
                mul *= arr[j];
            }
            result = Math.max(result, mul);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 6, -3, -10, 0, 2 };
        int result = maxproduct(arr); // 0(n^2);
        System.out.println(result);

        int betterresult = maxproductt(arr);
        System.out.println(betterresult);
    }
}
