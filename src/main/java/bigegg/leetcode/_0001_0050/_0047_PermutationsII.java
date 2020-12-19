//-----------------------------------------------------------------------------
// Runtime: 3ms
// Memory Usage: 39.7 MB
// Link: https://leetcode.com/submissions/detail/419630731/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0001_0050;

import java.util.*;

public final class _0047_PermutationsII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();

        Map<Integer, Integer> counter = new HashMap<>();
        for (int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }

        this.backtrack(new LinkedList<>(), nums.length, counter, results);
        return results;
    }

    protected void backtrack(LinkedList<Integer> queue, Integer N, Map<Integer, Integer> counter, List<List<Integer>> results) {
        if (queue.size() == N) {
            results.add(new ArrayList<>(queue));
            return;
        }

        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            Integer num = entry.getKey();
            Integer count = entry.getValue();

            if (count == 0)
                continue;

            queue.addLast(num);
            counter.put(num, count - 1);

            backtrack(queue, N, counter, results);

            queue.removeLast();
            counter.put(num, count);
        }
    }
}
