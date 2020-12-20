//-----------------------------------------------------------------------------
// Runtime: 42ms
// Memory Usage: 40.9 MB
// Link: https://leetcode.com/submissions/detail/432706685/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0601_0650;

public class _0644_MaximumAverageSubarrayII {
    public double findMaxAverage(int[] nums, int k) {
        double right = Integer.MIN_VALUE;
        double left = Integer.MAX_VALUE;
        for (int n: nums) {
            right = Math.max(right, n);
            left = Math.min(left, n);
        }

        while (right - left > 0.000001) {
            double mid = left + (right - left) * 0.5;
            if (check(nums, mid, k))
                left = mid;
            else
                right = mid;
        }
        return left;
    }

    private boolean check(int[] nums, double mid, int k) {
        double rightSum = 0;
        for (int i = 0; i < k; i++)
            rightSum += nums[i] - mid;
        if (rightSum >= 0)
            return true;

        double leftSum = 0, minleftSum = 0;
        for (int i = k; i < nums.length; i++) {
            rightSum += nums[i] - mid;
            leftSum += nums[i - k] - mid;
            minleftSum = Math.min(leftSum, minleftSum);
            if (rightSum >= minleftSum)
                return true;
        }

        return false;
    }
}
