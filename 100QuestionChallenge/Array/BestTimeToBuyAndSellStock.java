
public class BestTimeToBuyAndSellStock {

    public static int buyAndSell(int[] prices) {
        int diff = 0;
        int max = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            diff += prices[i + 1] - prices[i];

            if (diff < 0) {
                diff = 0;
            }

            if (diff > max) {
                max = diff;
            }
        }
        return max;

    }

    public static void main(String[] args) {

        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyAndSell(prices));
    }
}
