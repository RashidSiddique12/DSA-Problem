import java.util.*;

public class Findalltripletswithzerosum {

    public static List<List<Integer>> threeSum(int[] arr) {

        HashSet<List<Integer>> BigSet = new HashSet<>();
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            HashSet<Integer> smallSet = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int third = -(arr[i] + arr[j]);
                if (smallSet.contains(third)) {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                    Collections.sort(temp);
                    BigSet.add(temp);

                }
                smallSet.add(arr[j]);

            }

        }
        return new ArrayList<>(BigSet);

    }

    public static void main(String[] args) {
        int arr[] = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> result = threeSum(arr);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
