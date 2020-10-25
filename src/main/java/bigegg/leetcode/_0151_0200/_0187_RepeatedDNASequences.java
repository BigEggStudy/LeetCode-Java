//-----------------------------------------------------------------------------
// Runtime: 15ms
// Memory Usage: 47.7 MB
// Link: https://leetcode.com/submissions/detail/410130694/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0151_0200;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class _0187_RepeatedDNASequences {
    public List<String> findRepeatedDnaSequences(String s) {
        int L = 10, n = s.length();
        HashSet<String> seen = new HashSet(), output = new HashSet();

        // iterate over all sequences of length L
        for (int start = 0; start < n - L + 1; ++start) {
            String tmp = s.substring(start, start + L);
            if (seen.contains(tmp))
                output.add(tmp);
            seen.add(tmp);
        }
        return new ArrayList<>(output);
    }
}
