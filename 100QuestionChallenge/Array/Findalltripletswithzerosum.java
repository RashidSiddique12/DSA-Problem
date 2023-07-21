import java.util.*;

public class Findalltripletswithzerosum {

    // this approch will take extra space 0(m) we are adding the element in the hash
    // between the value of i & j and also adding resultant list in the hash so only
    // unique list will add
    // public static List<List<Integer>> threeSum(int[] arr) {

    // HashSet<List<Integer>> BigSet = new HashSet<>();
    // int n = arr.length;
    // for (int i = 0; i < n - 1; i++) {
    // HashSet<Integer> smallSet = new HashSet<>();
    // for (int j = i + 1; j < n; j++) {
    // int third = -(arr[i] + arr[j]);
    // if (smallSet.contains(third)) {
    // List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
    // Collections.sort(temp);
    // BigSet.add(temp);

    // }
    // smallSet.add(arr[j]);

    // }

    // }
    // return new ArrayList<>(BigSet);

    // }

    // this one is better approch
    public static List<List<Integer>> threeSum(int arr[]) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            int k = n - 1;
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    ans.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    j++;
                    k--;
                    while (j < k && arr[j] == arr[j - 1])
                        j++;
                    while (j < k && arr[k] == arr[k + 1])
                        k--;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { -1, 0, 1, 2, -1, -4 };
        // List<List<Integer>> result = threeSum(arr);
        // for (int i = 0; i < result.size(); i++) {
        // System.out.println(result.get(i));
        // }

        List<List<Integer>> betterResult = threeSum(arr);
        for (int i = 0; i < betterResult.size(); i++) {
            System.out.println(betterResult.get(i));
        }
    }
}
