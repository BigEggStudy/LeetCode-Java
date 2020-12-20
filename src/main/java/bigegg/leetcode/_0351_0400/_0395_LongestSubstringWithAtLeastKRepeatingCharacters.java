//-----------------------------------------------------------------------------
// Runtime: 3ms
// Memory Usage: 37.3 mb
// Link: https://leetcode.com/submissions/detail/432528349/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0351_0400;

import java.util.Arrays;

public class _0395_LongestSubstringWithAtLeastKRepeatingCharacters {
    public int longestSubstring(String s, int k) {
        char[] str = s.toCharArray();
        int[] countMap = new int[26];
        int letterCount = getUniqueLetterCount(s);
        int result = 0;

        for (int canUsedLetter = 1; canUsedLetter <= letterCount; canUsedLetter++) {
            Arrays.fill(countMap, 0);

            int left = 0, right = 0, usedLetter = 0, filled = 0;
            while (right < str.length) {
                if (usedLetter <= canUsedLetter) {
                    int idx = str[right] - 'a';
                    if (countMap[idx] == 0) usedLetter++;
                    countMap[idx]++;
                    if (countMap[idx] == k) filled++;
                    right++;
                } else {
                    int idx = str[left] - 'a';
                    if (countMap[idx] == k) filled--;
                    countMap[idx]--;
                    if (countMap[idx] == 0) usedLetter--;
                    left++;
                }
                if (usedLetter == filled)
                    result = Math.max(right - left, result);
            }
        }

        return result;
    }

    private int getUniqueLetterCount(String s) {
        boolean map[] = new boolean[26];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!map[s.charAt(i) - 'a']) {
                map[s.charAt(i) - 'a'] = true;
                count++;
            }
        }
        return count;
    }
}
