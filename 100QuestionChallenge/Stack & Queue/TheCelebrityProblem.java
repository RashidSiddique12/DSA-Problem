import java.util.*;

class TheCelebrityProblem {

    public static int findCelebrity(int[][] M) {
        int n = M.length;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            st.push(i);
        }
        while (st.size() >= 2) {
            int i = st.pop();
            int j = st.pop();
            if (M[i][j] == 1) {
                st.push(j);
            } else {
                st.push(i);
            }
        }

        int celebrity = st.pop();
        for (int i = 0; i < n; i++) {
            if (i != celebrity) {
                if (M[i][celebrity] == 0 || M[celebrity][i] == 1) {
                    return -1;
                }
            }
        }
        return celebrity;
    }

    public static void main(String[] args) {
        int M[][] = { { 0, 1, 0 },
                { 0, 0, 0 },
                { 0, 1, 0 }
        };

        int res = findCelebrity(M);
        System.out.println(res);
    }
}