//-----------------------------------------------------------------------------
// Runtime: 1ms
// Memory Usage: 41.5 MB
// Link: https://leetcode.com/submissions/detail/431489237/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0051_0100;

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
public class _0098_ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }

    private boolean validate(TreeNode root, Integer low, Integer high) {
        if (root == null) return true;

        if ((low != null && root.val <= low) || (high != null && root.val >= high)) {
            return false;
        }

        return validate(root.right, root.val, high) && validate(root.left, low, root.val);
    }
}
