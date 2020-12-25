//-----------------------------------------------------------------------------
// Runtime: 1ms
// Memory Usage: 40.5 MB
// Link: https://leetcode.com/submissions/detail/429393920/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0901_0950;

public class _0941_ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        int N = arr.length;
        int i = 0;

        while (i + 1 < N && arr[i] < arr[i + 1])
            i++;

        if (i == 0 || i == N-1)
            return false;

        while (i + 1 < N && arr[i] > arr[i + 1])
            i++;

        return i == N - 1;
    }
}
