//-----------------------------------------------------------------------------
// Runtime: 2ms
// Memory Usage: 40.3 MB
// Link: https://leetcode.com/submissions/detail/412795876/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0901_0950;

import bigegg.leetcode.TreeNode;

public class _0938_RangeSumOfBST {
    private int sum;

    public int rangeSumBST(TreeNode root, int low, int high) {
        sum = 0;
        dfs(root, low, high);
        return sum;
    }

    public void dfs(TreeNode node, int low, int high) {
        if (node == null) return;

        if (low <= node.val && node.val <= high)
            sum += node.val;

        if (low < node.val)
            dfs(node.left, low, high);
        if (node.val < high)
            dfs(node.right, low, high);
    }
}
