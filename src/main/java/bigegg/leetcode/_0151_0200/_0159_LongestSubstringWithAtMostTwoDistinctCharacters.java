//-----------------------------------------------------------------------------
// Runtime: 9ms
// Memory Usage: 38.8 MB
// Link: https://leetcode.com/submissions/detail/423180918/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0151_0200;

import java.util.Collections;
import java.util.HashMap;

public class _0159_LongestSubstringWithAtMostTwoDistinctCharacters {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int n = s.length();
        if (n < 3) return n;

        int left = 0;
        int right = 0;
        HashMap<Character, Integer> hashmap = new HashMap<>();

        int max_len = 2;
        while (right < n) {
            hashmap.put(s.charAt(right), right++);

            if (hashmap.size() == 3) {
                int del_idx = Collections.min(hashmap.values());
                hashmap.remove(s.charAt(del_idx));
                left = del_idx + 1;
            }

            max_len = Math.max(max_len, right - left);
        }
        return max_len;
    }
}
