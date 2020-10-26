//-----------------------------------------------------------------------------
// Runtime: 4ms
// Memory Usage: 39 MB
// Link: https://leetcode.com/submissions/detail/413483697/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0751_0800;

public class _0799_ChampagneTower {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] array = new double[102][102];
        array[0][0] = poured;
        for (int row = 0; row <= query_row; row++) {
            for (int col = 0; col <= row; col++) {
                double fall = (array[row][col] - 1) / 2;
                if (fall > 0) {
                    array[row + 1][col] = fall;
                    array[row + 1][col + 1] = fall;
                }
            }
        }

        return Math.min(1, array[query_row][query_glass]);
    }
}
