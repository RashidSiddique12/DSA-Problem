public class ContainerWithMostWater {

    public static int containMaxWater(int[] heights) {
        int maxWater = 0;
        int n = heights.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            int min = Math.min(heights[i], heights[j]);
            int water = min * (j - i);
            maxWater = Math.max(maxWater, water);
            if (heights[i] < heights[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxWater;

    }

    public static void main(String[] args) {
        int heights[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int maxWater = containMaxWater(heights);
        System.out.println(maxWater);
    }
}
