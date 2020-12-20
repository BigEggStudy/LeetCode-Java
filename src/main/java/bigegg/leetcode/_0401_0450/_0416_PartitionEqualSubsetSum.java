//-----------------------------------------------------------------------------
// Runtime: 8ms
// Memory Usage: 49 MB
// Link: https://leetcode.com/submissions/detail/432530922/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0401_0450;

public class _0416_PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        if (totalSum % 2 != 0) return false;

        int subSetSum = totalSum / 2;
        int n = nums.length;
        Boolean[][] memo = new Boolean[n + 1][subSetSum + 1];
        return dfs(nums, n - 1, subSetSum, memo);
    }

    public boolean dfs(int[] nums, int n, int subSetSum, Boolean[][] memo) {
        if (subSetSum == 0)
            return true;
        if (n == 0 || subSetSum < 0)
            return false;
        if (memo[n][subSetSum] != null)
            return memo[n][subSetSum];

        memo[n][subSetSum] = dfs(nums, n - 1, subSetSum - nums[n - 1], memo) ||
                dfs(nums, n - 1, subSetSum, memo);
        return memo[n][subSetSum];
    }
}
