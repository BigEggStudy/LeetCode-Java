//-----------------------------------------------------------------------------
// Runtime: 2ms
// Memory Usage: 40.3 MB
// Link: https://leetcode.com/submissions/detail/412795876/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0901_0950;

import java.util.Arrays;

public class _0948_BagOfTokens {
    public int bagOfTokensScore(int[] tokens, int P) {
        Arrays.sort(tokens);

        int lo = 0, hi = tokens.length - 1;
        int score = 0, result = 0;
        while (lo <= hi && (P >= tokens[lo] || score > 0)) {
            while (lo <= hi && P >= tokens[lo]) {
                P -= tokens[lo++];
                score++;
            }

            result = Math.max(result, score);

            if (lo <= hi && score > 0) {
                P += tokens[hi--];
                score--;
            }
        }

        return result;
    }
}
