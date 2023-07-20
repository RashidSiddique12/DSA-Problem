public class SearchAnElementInASortedAndRotatedArray {

    public static int find(int[] arr, int target) {

        int l = 0, h = arr.length - 1;
        while (l <= h) {
            int mid = (l + h) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[l] <= arr[mid]) {
                if (target >= arr[l] && target <= arr[mid]) {
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }

            } else {
                if (target >= arr[mid] && target <= arr[h]) {
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }

            }
            // System.out.println("loop");
        }
        return -1;

    }

    //// Dublicate case handle here
    public static boolean findIfDup(int[] nums, int target) {
        int l = 0, h = nums.length - 1;
        while (l <= h) {
            int mid = (l + h) / 2;

            if (nums[mid] == target) {
                return true;
            }
            if (nums[l] == nums[h]) {
                l++;
                continue;
            }

            if (nums[l] <= nums[mid]) {
                if (target >= nums[l] && target < nums[mid]) {
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[h]) {
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        int key = 7;
        int res = find(arr, key);
        System.out.println(res);

        int nums[] = { 2, 5, 6, 0, 0, 1, 2 };
        int target = 7;
        boolean dublicateRes = findIfDup(nums, target);
        System.out.println(dublicateRes);

    }
}
