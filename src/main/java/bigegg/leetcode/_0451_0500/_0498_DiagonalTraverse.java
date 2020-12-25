//-----------------------------------------------------------------------------
// Runtime: 2ms
// Memory Usage: 40.9 MB
// Link: https://leetcode.com/submissions/detail/434338475/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0451_0500;

public class _0498_DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return new int[0];

        int N = matrix.length;
        int M = matrix[0].length;

        int[] result = new int[N * M];
        int row = 0, col = 0;
        for (int i = 0; i < result.length; i++) {
            result[i] = matrix[row][col];
            if ((row + col) % 2 == 0) {
                if (col == M - 1) row++;
                else if (row == 0) col++;
                else { row--; col++; }
            } else {
                if (row == N - 1) col++;
                else if (col == 0) row++;
                else { row++; col--; }
            }
        }

        return result;
    }
}
