//-----------------------------------------------------------------------------
// Runtime: 0ms
// Memory Usage: 46.4 MB
// Link: https://leetcode.com/submissions/detail/425537564/
//-----------------------------------------------------------------------------

package bigegg.leetcode._1301_1350;

public class _1306_JumpGameIII {
    public boolean canReach(int[] arr, int start) {
        if (start < 0 || start >= arr.length) return false;
        if (arr[start] == 0) return true;
        if (arr[start] < 0) return false;

        arr[start] = -arr[start];
        return canReach(arr, start + arr[start]) || canReach(arr, start - arr[start]);
    }
}
