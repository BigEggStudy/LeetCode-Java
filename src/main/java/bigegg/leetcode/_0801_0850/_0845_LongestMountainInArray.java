//-----------------------------------------------------------------------------
// Runtime: 2ms
// Memory Usage: 40.1 MB
// Link: https://leetcode.com/submissions/detail/421096546/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0801_0850;

public class _0845_LongestMountainInArray {
    public int longestMountain(int[] A) {
        int N = A.length;
        int ans = 0, left = 0;
        while (left < N) {
            int right = left;
            if (right + 1 < N && A[right] < A[right + 1]) {
                while (right + 1 < N && A[right] < A[right + 1]) right++;

                if (right + 1 < N && A[right] > A[right + 1]) {
                    while (right + 1 < N && A[right] > A[right + 1]) right++;
                    ans = Math.max(ans, right - left + 1);
                }
            }

            left = Math.max(right, left + 1);
        }

        return ans >= 3 ? ans : 0;
    }
}
