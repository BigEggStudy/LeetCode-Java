//-----------------------------------------------------------------------------
// Runtime: 316ms
// Memory Usage: 
// Link: 
//-----------------------------------------------------------------------------

package bigegg.leetcode._0001_0050;

public final class _0005_LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }

        int n2 = s.length() * 2 + 1;
        char[] s2 = new char[s.length() * 2 + 1];
        for (int i = 0; i < s.length(); i++) {
            s2[i * 2] = '#';
            s2[i * 2 + 1] = s.charAt(i);
        }
        s2[n2 - 1] = '#';

        int[] p = new int[n2];
        int range_max = 0, center = 0, longestPalindromicCenter = 0;
        for (int i = 1; i < n2 - 1; i++) {
            if (range_max > i) {
                p[i] = p[center * 2 - i] < range_max - i ? p[center * 2 - i] : range_max - i;
            }

            while (i - 1 - p[i] >= 0 && i + 1 + p[i] < n2 && s2[i - 1 - p[i]] == s2[i + 1 + p[i]]) {
                p[i]++;
            }

            if (p[i] + i > range_max) {
                center = i;
                range_max = p[i] + i;
            }

            if (p[i] > p[longestPalindromicCenter]) {
                longestPalindromicCenter = i;
            }
        }

        int range = p[longestPalindromicCenter];
        int startIndex = (longestPalindromicCenter - range) / 2;
        return s.substring(startIndex, startIndex + range);
    }
}
