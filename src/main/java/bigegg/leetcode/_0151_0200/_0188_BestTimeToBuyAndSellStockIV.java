//-----------------------------------------------------------------------------
// Runtime: 2ms
// Memory Usage: 38.9 MB
// Link: https://leetcode.com/submissions/detail/410349283/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0151_0200;

public class _0188_BestTimeToBuyAndSellStockIV {
    public int maxProfit(int k, int[] prices) {
        if (2 * k >= prices.length) {
            int sum = 0;
            for (int i = 1; i < prices.length; i++) {
                sum += Math.max(0, prices[i] - prices[i - 1]);
            }
            return sum;
        }

        int[] dp = new int[prices.length];
        for (int i = 0; i < k; i++) {
            int profit = 0;
            for (int j = 1; j < prices.length; j++) {
                profit = Math.max(dp[j], profit + prices[j] - prices[j - 1]);
                dp[j] = Math.max(dp[j - 1], profit);
            }
        }

        return dp[prices.length - 1];
    }
}
