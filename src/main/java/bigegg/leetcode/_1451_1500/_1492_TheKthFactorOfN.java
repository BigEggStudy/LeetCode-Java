//-----------------------------------------------------------------------------
// Runtime: 0ms
// Memory Usage: 35.5 MB
// Link: https://leetcode.com/submissions/detail/433811206/
//-----------------------------------------------------------------------------

package bigegg.leetcode._1451_1500;

public class _1492_TheKthFactorOfN {
    public int kthFactor(int n, int k) {
        int d = 1;
        for (; d * d <= n; d++)
            if (n % d == 0 && --k == 0)
                return d;

        for (d = d - 1; d >= 1; d--) {
            if (d * d == n) continue;
            if (n % d == 0 && --k == 0)
                return n / d;
        }

        return -1;
    }
}
