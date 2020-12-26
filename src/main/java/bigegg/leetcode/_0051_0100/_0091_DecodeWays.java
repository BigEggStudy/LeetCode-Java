//-----------------------------------------------------------------------------
// Runtime: 1ms
// Memory Usage: 37.5 MB
// Link: https://leetcode.com/submissions/detail/434907304/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0051_0100;

public class _0091_DecodeWays {
    public int numDecodings(String s) {
        if(s == null || s.length() == 0) return 0;

        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;

        for (int i = 2; i < dp.length; i++) {
            if(s.charAt(i - 1) != '0')
                dp[i] += dp[i-1];

            int twoDigit = Integer.parseInt(s.substring(i - 2, i));
            if (twoDigit >= 10 && twoDigit <= 26)
                dp[i] += dp[i-2];
        }

        return dp[s.length()];
    }
}
