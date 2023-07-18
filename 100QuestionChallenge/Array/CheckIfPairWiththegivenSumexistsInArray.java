import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

class CheckIfPairWiththegivenSumexistsInArray {

    public static void find(int arr[], int target) {
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            mp.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {

            int rem = target - arr[i];
            if (mp.containsKey(rem) && mp.get(rem) != i) {
                System.out.println("yes");
                System.out.println(i + " " + mp.get(rem));
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 3, 8 };
        int target = 11;
        find(arr, target);

    }
}