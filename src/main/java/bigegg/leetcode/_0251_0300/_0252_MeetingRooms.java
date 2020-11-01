//-----------------------------------------------------------------------------
// Runtime: 4ms
// Memory Usage: 38.9 MB
// Link: https://leetcode.com/submissions/detail/415683768/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0251_0300;

import java.util.Arrays;
import java.util.Comparator;

public class _0252_MeetingRooms {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] i1, int[] i2) {
                return i1[0] - i2[0];
            }
        });

        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i][1] > intervals[i + 1][0])
                return false;
        }

        return true;
    }
}
