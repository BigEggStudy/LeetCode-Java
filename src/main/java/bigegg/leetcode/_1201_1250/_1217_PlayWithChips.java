//-----------------------------------------------------------------------------
// Runtime: 0ms
// Memory Usage: 36.4 MB
// Link: https://leetcode.com/submissions/detail/417141709/
//-----------------------------------------------------------------------------

package bigegg.leetcode._1201_1250;

public class _1217_PlayWithChips {
    public int minCostToMoveChips(int[] position) {
        int evenCount = 0;
        int oddCount = 0;
        for (int i : position) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        return Math.min(oddCount, evenCount);
    }
}
