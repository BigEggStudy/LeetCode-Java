//-----------------------------------------------------------------------------
// Runtime: 2ms
// Memory Usage: 
// Link: 
//-----------------------------------------------------------------------------

package bigegg.leetcode._1151_1200;

public class _1197_MinimumKnightMoves {
    public int minKnightMoves(int x, int y) {
        x = Math.abs(x);
        y = Math.abs(y);
        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }

        int[][] cache = new int[301][301];
        return dp(x, y, cache);
    }

    private int dp(int x, int y, int[][] cache ) {
        if (x + y == 0) return 0;
        if (x == 0 && y == 1) return 3;
        if ((x == 0 && y == 2) || (x == 1 && y == 1)) return 2;
        if (cache[x][y] > 0) return cache[x][y];

        int result =  Math.min(dp(Math.abs(x - 1), Math.abs(y - 2), cache), dp(Math.abs(x - 2), Math.abs(y - 1), cache)) + 1;
        cache[x][y] = result;
        return result;
    }
}
