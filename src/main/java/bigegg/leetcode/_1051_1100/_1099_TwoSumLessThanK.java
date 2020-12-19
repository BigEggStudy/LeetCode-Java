//-----------------------------------------------------------------------------
// Runtime: 1ms
// Memory Usage: 38.3 MB
// Link: https://leetcode.com/submissions/detail/418204711/
//-----------------------------------------------------------------------------

package bigegg.leetcode._1051_1100;

import java.util.Arrays;

public class _1099_TwoSumLessThanK {
    public int twoSumLessThanK(int[] A, int K) {
        Arrays.sort(A);

        int left = 0, right = A.length - 1;
        int max = -1;
        while (left < right) {
            int sum = A[left] + A[right];
            if (sum < K) {
                left++;
                max = Math.max(max, sum);
            }
            else
                right--;
        }

        return max;
    }
}
