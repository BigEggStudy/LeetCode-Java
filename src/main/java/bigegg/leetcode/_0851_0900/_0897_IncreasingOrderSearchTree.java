//-----------------------------------------------------------------------------
// Runtime: 0ms
// Memory Usage: 36.6 MB
// Link: https://leetcode.com/submissions/detail/426876324/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0851_0900;

import bigegg.leetcode.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class _0897_IncreasingOrderSearchTree {
    private TreeNode current;

    public TreeNode increasingBST(TreeNode root) {
        TreeNode head = new TreeNode(-1);
        current = head;
        inOrder(root);
        return head.right;
    }

    private void inOrder(TreeNode node) {
        if (node == null) return;
        inOrder(node.left);
        node.left = null;
        current.right = node;
        current = node;
        inOrder(node.right);
    }
}
