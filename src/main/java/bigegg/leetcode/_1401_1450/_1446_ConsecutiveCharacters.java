//-----------------------------------------------------------------------------
// Runtime: 1ms
// Memory Usage: 37.7 MB
// Link: https://leetcode.com/submissions/detail/416456770/
//-----------------------------------------------------------------------------

package bigegg.leetcode._1401_1450;

public class _1446_ConsecutiveCharacters {
    public int maxPower(String s) {
        int count = 0;
        int maxCount = 0;
        char previous = ' ';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == previous) {
                count++;
            } else {
                count = 1;
                previous = c;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}
