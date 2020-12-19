//-----------------------------------------------------------------------------
// Runtime: 2ms
// Memory Usage: 
// Link: 
//-----------------------------------------------------------------------------

package bigegg.leetcode._0301_0350;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _0310_MinimumHeightTrees {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n < 2) {
            ArrayList<Integer> centroids = new ArrayList<>();
            for (int i = 0; i < n; i++)
                centroids.add(i);
            return centroids;
        }

        ArrayList<Set<Integer>> neighbors = new ArrayList<>();
        for (int i = 0; i < n; i++)
            neighbors.add(new HashSet<>());
        for (int[] edge : edges) {
            int start = edge[0], end = edge[1];
            neighbors.get(start).add(end);
            neighbors.get(end).add(start);
        }

        ArrayList<Integer> leaves = new ArrayList<>();
        for (int i = 0; i < n; i++)
            if (neighbors.get(i).size() == 1)
                leaves.add(i);

        int remainingNodes = n;
        while (remainingNodes > 2) {
            remainingNodes -= leaves.size();
            ArrayList<Integer> newLeaves = new ArrayList<>();

            for (Integer leaf : leaves) {
                for (Integer neighbor : neighbors.get(leaf)) {
                    neighbors.get(neighbor).remove(leaf);
                    if (neighbors.get(neighbor).size() == 1)
                        newLeaves.add(neighbor);
                }
            }

            leaves = newLeaves;
        }

        return leaves;
    }
}
