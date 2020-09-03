//-----------------------------------------------------------------------------
// Runtime: 4ms
// Memory Usage: 
// Link: 
//-----------------------------------------------------------------------------

package bigegg.leetcode._1001_1050;

public class _1007_MinimumDominoRotationsForEqualRow {
    public int minDominoRotations(int[] A, int[] B) {
        int result = check(A, B, A[0]);
        if ((result != -1) || (A[0] == B[0])) return result;
        return check(A, B, B[0]);
    }

    private int check(int[] A, int[] B, int num) {
        int rotate_a = 0, rotate_b = 0;
        for (int i = 0; i < A.length; i++) {
            if (num != A[i] && num != B[i]) return -1;
            if (num != A[i]) rotate_a++;
            if (num != B[i]) rotate_b++;
        }

        return Math.min(rotate_a, rotate_b);
    }
}
