//-----------------------------------------------------------------------------
// Runtime: 6ms
// Memory Usage: 41.9 MB
// Link: https://leetcode.com/submissions/detail/421740478/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0051_0100;

import java.util.Arrays;
import java.util.LinkedList;

public class _0056_MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] interval : intervals) {
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            } else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
