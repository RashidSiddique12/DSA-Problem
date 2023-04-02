import java.util.*;

class code {
    static int q = 0;

    public static void main(String[] args) {
        int arr[] = { 5, 3, 3, 2, 5, 2, 3, 2 }; // 5->2, 3->3, 2->3,

        System.out.println(sol(arr));
    }

    public static int sol(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        // int q = 0;
        int res = 0;
        HashSet<Integer> hs = new HashSet<>();

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            int val = e.getValue();
            hsfun(val, hs);
        }

        return q;
    }

    public static void hsfun(int val, HashSet<Integer> hs) {

        if (hs.contains(val)) {
            val--;
            q++;
            hsfun(val, hs);
        } else {
            hs.add(val);
        }

        // return q;

    }
}