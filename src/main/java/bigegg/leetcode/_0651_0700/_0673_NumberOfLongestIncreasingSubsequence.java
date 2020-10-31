//-----------------------------------------------------------------------------
// Runtime: 16ms
// Memory Usage: 38.2 MB
// Link: https://leetcode.com/submissions/detail/414837400/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0651_0700;

import java.util.Arrays;

public class _0673_NumberOfLongestIncreasingSubsequence {
    public int findNumberOfLIS(int[] nums) {
        int N = nums.length;
        if (N <= 1) return N;

        int[] lengths = new int[N];
        int[] counts = new int[N];
        Arrays.fill(lengths,1);
        Arrays.fill(counts, 1);

        int longest = 0;
        int result = 0;
        for (int j = 0; j < N; j++) {
            int count = 1;

            for (int i = 0; i < j; i++)
                if (nums[i] < nums[j]) {
                    if (lengths[i] >= lengths[j]) {
                        lengths[j] = lengths[i] + 1;
                        count = counts[i];
                    } else if (lengths[i] + 1 == lengths[j]) {
                        count += counts[i];
                    }
                }

            counts[j] = count;

            if (lengths[j] > longest) {
                result = count;
                longest = lengths[j];
            } else if (longest == lengths[j]){
                result += count;
            }
        }

        return result;
    }
}
