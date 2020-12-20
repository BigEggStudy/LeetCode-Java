//-----------------------------------------------------------------------------
// Runtime: 0ms
// Memory Usage: 35.9 MB
// Link: https://leetcode.com/submissions/detail/422730399/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0901_0950;

public class _0902_NumbersAtMostNGivenDigitSet {
    public int atMostNGivenDigitSet(String[] digits, int n) {
        String S = String.valueOf(n);
        int K = S.length();
        int[] dp = new int[K + 1];
        dp[K] = 1;

        for (int i = K - 1 ; i >= 0; i--) {
            int Si = S.charAt(i) - '0';
            for (String d: digits) {
                if (Integer.parseInt(d) < Si)
                    dp[i] += Math.pow(digits.length, K - i - 1);
                else if (Integer.parseInt(d) == Si)
                    dp[i] += dp[i + 1];
            }
        }

        for (int i = 1; i < K; ++i)
            dp[0] += Math.pow(digits.length, i);
        return dp[0];
    }
}
