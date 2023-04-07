//https://leetcode.com/problems/sort-the-people/description/

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        for (int i = 0; i < heights.length; i++) {
            tm.put(heights[i], names[i]);
        }

        String[] arrName = new String[heights.length];
        int i = heights.length - 1;

        for (int sort : tm.keySet()) {
            arrName[i] = tm.get(sort);
            i--;

        }
        return arrName;

    }
}