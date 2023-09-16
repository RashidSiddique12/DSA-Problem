import java.util.*;

class CheckMirrorInNarytree {

    public static boolean isMirror(int[] A, int[] B) {
        if (A.length != B.length)
            return false;
        Map<Integer, Stack<Integer>> map = new HashMap<>();
        for (int i = 0; i < A.length; i = i + 2) {
            if (map.containsKey(A[i])) {
                map.get(A[i]).push(A[i + 1]);
            } else {
                Stack<Integer> s = new Stack<>();
                s.push(A[i + 1]);
                map.put(A[i], s);
            }
        }
        for (int i = 0; i < B.length; i = i + 2) {
            if (B[i + 1] != map.get(B[i]).pop()) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int A[] = { 1, 2, 1, 3 };
        int B[] = { 1, 3, 1, 2 };
        boolean res = isMirror(A, B);
        System.out.println(res);
    }
}