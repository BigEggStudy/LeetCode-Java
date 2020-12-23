//-----------------------------------------------------------------------------
// Runtime: 0ms
// Memory Usage: 39.4 MB
// Link: https://leetcode.com/submissions/detail/433804340/
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
public class _0104_MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth((root.right))) + 1;
    }
}
