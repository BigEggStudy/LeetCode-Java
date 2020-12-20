//-----------------------------------------------------------------------------
// Runtime: 5ms
// Memory Usage: 48.8 MB
// Link: https://leetcode.com/submissions/detail/421097457/
//-----------------------------------------------------------------------------

package bigegg.leetcode._1251_1300;

import java.util.ArrayList;
import java.util.List;

public class _1272_RemoveInterval {
    public List<List<Integer>> removeInterval(int[][] intervals, int[] toBeRemoved) {
        int removeStart = toBeRemoved[0], removeEnd = toBeRemoved[1];
        List<List<Integer>> output = new ArrayList<List<Integer>>();

        for (int[] interval : intervals) {
            int start = interval[0], end = interval[1];

            if (end <= removeStart || start >= removeEnd) {
                output.add(new ArrayList<Integer>() {{add(start); add(end); }});
            } else {
                if (start < removeStart) {
                    output.add(new ArrayList<Integer>() {{ add(start); add(removeStart); }});
                }
                if (end > removeEnd) {
                    output.add(new ArrayList<Integer>() {{add(removeEnd); add(end); }});
                }
            }
        }
        return output;
    }
}
