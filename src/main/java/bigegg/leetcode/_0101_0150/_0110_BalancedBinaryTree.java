//-----------------------------------------------------------------------------
// Runtime: 0ms
// Memory Usage: 39.1 MB
// Link: https://leetcode.com/submissions/detail/433535388/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0101_0150;

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
public class _0110_BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
    }

    private int getHeight(TreeNode current) {
        if (current == null) return 0;
        int leftHeight = getHeight(current.left);
        if (leftHeight == -1) return -1;
        int rightHeight = getHeight(current.right);
        if (rightHeight == -1) return -1;
        if (Math.abs(leftHeight - rightHeight) > 1) return -1;
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
