//-----------------------------------------------------------------------------
// Runtime: 3ms
// Memory Usage: 36.1 MB
// Link: https://leetcode.com/submissions/detail/413137948/
//-----------------------------------------------------------------------------

package bigegg.leetcode._1501_1550;

public class _1510_StoneGameIV {
    public boolean winnerSquareGame(int n) {
        boolean[] dp = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            if (dp[i]) continue;

            for (int k = 1; i + k * k <= n; k++)
                dp[i + k * k] = true;
        }

        return dp[n];
    }
}
