//https://leetcode.com/problems/pascals-triangle/description/

class Solution {

    public static int nCr(int n, int r) {
        int res = 1;
        for (int k = 0; k < r; k++) {
            res = res * (n - k);
            res = res / (k + 1);

        }
        return res;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> l = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                l.add(nCr(i, j));
            }
            list.add(l);
        }
        return list;
    }
}