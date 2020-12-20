//-----------------------------------------------------------------------------
// Runtime: 0ms
// Memory Usage: 39 MB
// Link: https://leetcode.com/submissions/detail/432165440/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0301_0350;

public class _0334_IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num: nums) {
            if (num <= first) first = num;
            else if (num <= second) second = num;
            else return true;
        }

        return false;
    }
}
