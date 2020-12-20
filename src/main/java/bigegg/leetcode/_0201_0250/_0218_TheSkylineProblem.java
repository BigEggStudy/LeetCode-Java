//-----------------------------------------------------------------------------
// Runtime: 31ms
// Memory Usage: 42 MB
// Link: https://leetcode.com/submissions/detail/432708467/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0201_0250;

import java.util.*;

public class _0218_TheSkylineProblem {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        Map<Integer, List<Integer>> sortedList = new TreeMap<>();
        for (int[] building : buildings)
        {
            if (!sortedList.containsKey(building[0]))
                sortedList.put(building[0], new ArrayList<>());
            if (!sortedList.containsKey(building[1]))
                sortedList.put(building[1], new ArrayList<>());

            sortedList.get(building[0]).add(building[2]);
            sortedList.get(building[1]).add(-building[2]);
        }

        List<List<Integer>> results = new ArrayList<>();
        Map<Integer, Integer> heights = new TreeMap<>(Comparator.reverseOrder());

        for (Integer x : sortedList.keySet()) {
            for (Integer height : sortedList.get(x)) {
                if (height > 0) {
                    heights.put(height, heights.getOrDefault(height, 0) + 1);
                } else {
                    heights.put(-height, heights.get(-height) - 1);
                    if (heights.get(-height) == 0)
                        heights.remove(-height);
                }
            }

            if (heights.size() == 0)
                results.add(new ArrayList<Integer>() {{ add(x); add(0); }});
            else {
                int max = heights.keySet().iterator().next();
                if (results.size() == 0 || results.get(results.size() - 1).get(1) != max)
                    results.add(new ArrayList<Integer>() {{ add(x); add(max); }});
            }
        }

        return results;
    }
}
