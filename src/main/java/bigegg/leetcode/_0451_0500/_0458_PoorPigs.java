//-----------------------------------------------------------------------------
// Runtime: 0ms
// Memory Usage: 35.8 MB
// Link: https://leetcode.com/submissions/detail/420385748/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0451_0500;

public class _0458_PoorPigs {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int states = minutesToTest / minutesToDie + 1;
        return (int) Math.ceil(Math.log(buckets) / Math.log(states));
    }
}
