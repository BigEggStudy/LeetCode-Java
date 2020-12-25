//-----------------------------------------------------------------------------
// Runtime: 7ms
// Memory Usage: 52.8 MB
// Link: https://leetcode.com/submissions/detail/434337136/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0101_0150;

import java.util.ArrayList;
import java.util.List;

public class _0131_PalindromePartitioning {
    public List<List<String>> partition(String s) {
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        List<List<String>> result = new ArrayList<>();
        dfs(result, s, 0, new ArrayList<>(), dp);
        return result;
    }

    private void dfs(List<List<String>> result, String s, int start, List<String> currentList, boolean[][] dp) {
        if (start >= s.length())
            result.add(new ArrayList<>(currentList));

        for (int end = start; end < s.length(); end++) {
            if (s.charAt(start) == s.charAt(end) && (end - start <= 2 || dp[start + 1][end - 1])) {
                dp[start][end] = true;
                currentList.add(s.substring(start, end + 1));
                dfs(result, s, end + 1, currentList, dp);
                currentList.remove(currentList.size() - 1);
            }
        }
    }
}
