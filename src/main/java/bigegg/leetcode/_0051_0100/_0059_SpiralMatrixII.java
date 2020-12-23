//-----------------------------------------------------------------------------
// Runtime: 0ms
// Memory Usage: 37.1 MB
// Link: https://leetcode.com/submissions/detail/433814690/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0051_0100;

public class _0059_SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int num = 1;
        int n2 = n * n;
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int dir = 0;
        int row = 0;
        int col = 0;
        while (num <= n2) {
            result[row][col] = num++;
            int r = Math.floorMod(row + dirs[dir][0], n);
            int c = Math.floorMod(col + dirs[dir][1], n);

            // change direction if next cell is non zero
            if (result[r][c] != 0) dir = (dir + 1) % 4;

            row += dirs[dir][0];
            col += dirs[dir][1];
        }
        return result;
    }
}
