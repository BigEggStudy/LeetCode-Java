//-----------------------------------------------------------------------------
// Runtime: 162ms
// Memory Usage: 38.7 MB
// Link: https://leetcode.com/submissions/detail/434335167/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0301_0350;

public class _0312_BurstBalloons {
    public int maxCoins(int[] nums) {
        int[] paddingNums = new int[nums.length + 2];
        for (int i = 0; i < nums.length; i++)
            paddingNums[i + 1] = nums[i];
        paddingNums[0] = paddingNums[nums.length + 1] = 1;

        int[][] memo = new int[paddingNums.length][paddingNums.length];

        return dp(paddingNums, 0, paddingNums.length - 1, memo);
    }

    private int dp(int[] nums, int left, int right, int[][] memo) {
        if (right - left == 1) return 0;
        if (memo[left][right] > 0) return memo[left][right];

        int result = 0;
        for (int i = left + 1; i < right; i++)
            result = Math.max(
                result,
                nums[left] * nums[i] * nums[right] + dp(nums, left, i, memo) + dp(nums, i, right, memo)
            );

        memo[left][right] = result;
        return result;
    }
}
