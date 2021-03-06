//-----------------------------------------------------------------------------
// Runtime: 0ms
// Memory Usage: 35.6 MB
// Link: https://leetcode.com/submissions/detail/421331420/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0851_0900;

public class _0858_MirrorReflection {
    public int mirrorReflection(int p, int q) {
        int g = gcd(p, q);
        p /= g; p %= 2;
        q /= g; q %= 2;

        if (p == 1 && q == 1) return 1;
        return p == 1 ? 0 : 2;
    }

    public int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }
}
