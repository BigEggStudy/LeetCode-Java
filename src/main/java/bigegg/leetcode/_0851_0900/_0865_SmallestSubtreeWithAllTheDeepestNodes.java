//-----------------------------------------------------------------------------
// Runtime: 0ms
// Memory Usage: 38.3 MB
// Link: https://leetcode.com/submissions/detail/434333419/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0851_0900;

import bigegg.leetcode.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class _0865_SmallestSubtreeWithAllTheDeepestNodes {
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return getDeepest(root, 0).node;
    }

    private Result getDeepest(TreeNode node, int deep)
    {
        if (node == null) return new Result(node, 0);

        Result left = getDeepest(node.left, deep + 1);
        Result right = getDeepest(node.right, deep + 1);

        if (left.deep > right.deep) return new Result(left.node, left.deep + 1);
        else if (left.deep < right.deep) return new Result(right.node, right.deep + 1);
        else
            return new Result(node, left.deep + 1);
    }

    private class Result {
        TreeNode node;
        int deep;

        Result(TreeNode node, int deep) {
            this.node = node;
            this.deep = deep;
        }
    }
}
