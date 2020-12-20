//-----------------------------------------------------------------------------
// Runtime: 2ms
// Memory Usage: 35.7 MB
// Link: https://leetcode.com/submissions/detail/424232149/
//-----------------------------------------------------------------------------

package bigegg.leetcode._1001_1050;

public class _1015_SmallestIntegerDivisibleByK {
    public int smallestRepunitDivByK(int K) {
        int remainder = 0;
        for (int length_N = 1; length_N <= K; length_N++) {
            remainder = (remainder * 10 + 1) % K;
            if (remainder == 0) {
                return length_N;
            }
        }
        return -1;
    }
}
