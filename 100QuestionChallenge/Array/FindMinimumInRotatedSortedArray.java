
public class FindMinimumInRotatedSortedArray {

    public static int findLeastMin(int[] arr) {
        int l = 0;
        int h = arr.length - 1;

        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] < arr[mid - 1]) {
                return arr[mid];
            } else if (arr[mid] > arr[h]) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 1, 2, 3 };
        int res = findLeastMin(arr);
        System.out.println(res);
    }
}
