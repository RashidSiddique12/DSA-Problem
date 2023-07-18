import java.util.*;

public class FindDuplicates {

    public static List<Integer> dublicates(int arr[]) {

        List<Integer> l = new ArrayList<>();
        int n = arr.length;
        int i = 0;
        while (n > i) {
            int ce = i + 1;
            if (ce == arr[i]) {
                i++;
            } else {
                int pos = arr[i];
                if (pos == arr[pos - 1]) { // if the data already in correct position
                    i++;
                }
                // swap
                else {
                    int temp = arr[i];
                    arr[i] = arr[temp - 1];
                    arr[temp - 1] = temp;

                }
            }

        }

        for (int j = 0; j < n; j++) {
            if (j + 1 != arr[j]) {
                l.add(arr[j]);
            }
        }
        return l;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 3 };
        List<Integer> list = dublicates(arr);

        // print
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }

}
