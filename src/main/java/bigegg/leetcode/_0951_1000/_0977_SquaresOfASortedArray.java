//-----------------------------------------------------------------------------
// Runtime: 1ms
// Memory Usage: 41.3 MB
// Link: https://leetcode.com/submissions/detail/431043471/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0951_1000;

public class _0977_SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int N = nums.length;
        int j = 0;
        while (j < N && nums[j] < 0)
            j++;
        int i = j - 1;

        int[] ans = new int[N];
        int t = 0;

        while (i >= 0 && j < N) {
            if (nums[i] * nums[i] < nums[j] * nums[j]) {
                ans[t++] = nums[i] * nums[i];
                i--;
            } else {
                ans[t++] = nums[j] * nums[j];
                j++;
            }
        }

        while (i >= 0) {
            ans[t++] = nums[i] * nums[i];
            i--;
        }
        while (j < N) {
            ans[t++] = nums[j] * nums[j];
            j++;
        }

        return ans;
    }
}
