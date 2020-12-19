//-----------------------------------------------------------------------------
// Runtime: 1ms
// Memory Usage: 36.6 MB
// Link: https://leetcode.com/submissions/detail/419250311/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0551_0600;

import java.util.Arrays;

public class _0593_ValidSquare {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[][] p={p1,p2,p3,p4};
        Arrays.sort(p, (l1, l2) -> l2[0] == l1[0] ? l1[1] - l2[1] : l1[0] - l2[0]);

        return dist(p[0], p[1]) != 0 &&
                dist(p[0], p[1]) == dist(p[1], p[3]) && dist(p[1], p[3]) == dist(p[2], p[3]) && dist(p[2], p[3]) == dist(p[0], p[2]) &&
                dist(p[0], p[3]) == dist(p[1], p[2]);
    }

    private double dist(int[] p1, int[] p2) {
        return (p2[1] - p1[1]) * (p2[1] - p1[1]) + (p2[0] - p1[0]) * (p2[0] - p1[0]);
    }
}
