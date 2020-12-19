//-----------------------------------------------------------------------------
// Runtime: 0ms
// Memory Usage: 39.9 MB
// Link: https://leetcode.com/submissions/detail/418598104/
//-----------------------------------------------------------------------------

package bigegg.leetcode._1001_1050;

import bigegg.leetcode.TreeNode;

public class _1026_MaximumDifferenceBetweenNodeAndAncestor {
    public int maxAncestorDiff(TreeNode root) {
        return maxAncestorDiff(root, root.val, root.val);
    }

    private int maxAncestorDiff(TreeNode node, int min, int max)
    {
        if (node == null) return max - min;

        if (node.val < min)
            min = node.val;
        else if (node.val > max)
            max = node.val;

        return Math.max(maxAncestorDiff(node.left, min, max), maxAncestorDiff(node.right, min, max));
    }
}
