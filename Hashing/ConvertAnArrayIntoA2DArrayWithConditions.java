
//https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/description/

class Solution {
    // public List<List<Integer>> findMatrix(int[] nums) {
    // HashMap<Integer, Integer> map = new HashMap<>();
    // for (int i = 0; i < nums.length; i++) {
    // map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    // }
    // ArrayList<List<Integer>> list = new ArrayList<>();
    // while (map.size() > 0) {
    // ArrayList<Integer> ls = new ArrayList<>();
    // Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
    // //
    // while (iterator.hasNext()) {
    // Map.Entry<Integer, Integer> entry = iterator.next();
    // ls.add(entry.getKey());
    // int n = entry.getValue();
    // n--;
    // if (n == 0) {
    // iterator.remove();
    // } else {
    // map.put(entry.getKey(), n);
    // }
    // }
    // list.add(ls);
    // }
    // return list;

    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> map = new ConcurrentHashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        }

        ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
        while (map.size() > 0) {
            ArrayList<Integer> ls = new ArrayList<>();
            for (Map.Entry<Integer, Integer> e : map.entrySet())

            {
                ls.add(e.getKey());
                int n = e.getValue();
                n--;
                if (n == 0) {
                    map.remove(e.getKey());
                } else {
                    map.put(e.getKey(), n);
                }
            }
            list.add(ls);
        }

        return list;

    }
}
