public class TrappingRainWater {

    // tc = 0(n) but its also taking extra space so i make second method where i
    // have't use extra space;
    // public static int trapWater(int[] height) {
    // int n = height.length;
    // int left[] = new int[n];
    // int right[] = new int[n];
    // int temp1 = height[0];
    // int temp2 = height[n - 1];
    // left[0] = temp1;
    // right[n - 1] = temp2;
    // for (int i = 1, j = n - 2; i < n && j >= 0; i++, j--) {
    // if (height[i] > temp1) {
    // temp1 = height[i];
    // left[i] = temp1;
    // } else {
    // left[i] = temp1;
    // }

    // if (height[j] > temp2) {
    // temp2 = height[j];
    // right[j] = temp2;
    // } else {
    // right[j] = temp2;
    // }
    // }
    // int water = 0;
    // for (int i = 0; i < n; i++) {
    // water += Math.min(left[i], right[i]) - height[i];
    // }
    // return water;
    // }

    // no Extra space is used here
    public static int trapWater(int[] height) {
        int n = height.length;
        int l = 0, r = n - 1;
        int l_max = 0, r_max = 0;
        int water = 0;
        while (l < r) {
            if (height[l] <= height[r]) {
                if (height[l] > l_max) {
                    l_max = height[l];
                } else {
                    water += l_max - height[l];
                }
                l++;
            } else {
                if (height[r] >= r_max) {
                    r_max = height[r];
                } else {
                    water += r_max - height[r];
                }
                r--;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int res = trapWater(height);
        System.out.println(res);
    }
}
