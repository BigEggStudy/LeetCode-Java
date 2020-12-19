//-----------------------------------------------------------------------------
// Runtime: 10ms
// Memory Usage: 41.3 MB
// Link: https://leetcode.com/submissions/detail/417663845/
//-----------------------------------------------------------------------------

package bigegg.leetcode._1251_1300;

import bigegg.leetcode.ListNode;

public class _1283_FindTheSmallestDivisorGivenAThreshold {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = nums[nums.length - 1];
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int num = computeSum(nums, mid);

            if (num > threshold) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    private int computeSum(int[] nums, int x) {
        int s = 0;
        for (int n : nums) {
            s += n / x + (n % x == 0 ? 0 : 1);
        }
        return s;
    }
}
