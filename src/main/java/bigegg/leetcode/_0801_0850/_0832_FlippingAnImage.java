//-----------------------------------------------------------------------------
// Runtime: 0ms
// Memory Usage: 39.7 MB
// Link: https://leetcode.com/submissions/detail/419018802/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0801_0850;

public class _0832_FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {
        int C = A.length;
        for (int[] row: A)
            for (int i = 0; i < (C + 1) / 2; i++) {
                int tmp = row[i] ^ 1;
                row[i] = row[C - 1 - i] ^ 1;
                row[C - 1 - i] = tmp;
            }

        return A;
    }
}
