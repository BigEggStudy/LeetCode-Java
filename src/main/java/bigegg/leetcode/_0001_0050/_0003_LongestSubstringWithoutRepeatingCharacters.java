//-----------------------------------------------------------------------------
// Runtime: 368ms
// Memory Usage: 
// Link: 
//-----------------------------------------------------------------------------

package bigegg.leetcode._0001_0050;

public final class _0003_LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int[] map = new int[256];
        for (int i = 0; i < 256; i++) {
            map[i] = -1;
        }

        int maxLen = 0;
        int lastRepeatPos = -1;
        for (int i = 0; i < s.length(); i++) {
            if (map[s.charAt(i)] != -1 && lastRepeatPos < map[s.charAt(i)]) {
                lastRepeatPos = map[s.charAt(i)];
            }
            if (maxLen < i - lastRepeatPos) {
                maxLen = i - lastRepeatPos;
            }
            map[s.charAt(i)] = i;
        }

        return maxLen;
    }
}
