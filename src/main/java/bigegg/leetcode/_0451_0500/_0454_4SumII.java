//-----------------------------------------------------------------------------
// Runtime: 59ms
// Memory Usage: 58.2 MB
// Link: https://leetcode.com/submissions/detail/431816618/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0451_0500;

import java.util.HashMap;
import java.util.Map;

public class _0454_4SumII {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int count = 0;
        Map<Integer, Integer> m = new HashMap<>();
        for (int a : A)
            for (int b : B)
                m.put(a + b, m.getOrDefault(a + b, 0) + 1);
        for (int c : C)
            for (int d : D)
                count += m.getOrDefault(-(c + d), 0);
        return count;
    }
}
