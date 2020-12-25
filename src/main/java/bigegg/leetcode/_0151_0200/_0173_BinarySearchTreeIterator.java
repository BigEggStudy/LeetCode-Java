//-----------------------------------------------------------------------------
// Runtime: 15ms
// Memory Usage: 43 MB
// Link: https://leetcode.com/submissions/detail/434330290/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0151_0200;

import bigegg.leetcode.TreeNode;

import java.util.Stack;

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
public class _0173_BinarySearchTreeIterator {
    private Stack<TreeNode> stack;

    public _0173_BinarySearchTreeIterator(TreeNode root) {
        this.stack = new Stack<TreeNode>();
        this.leftmostInorder(root);
    }

    public int next() {
        TreeNode topmostNode = this.stack.pop();
        if (topmostNode.right != null) {
            this.leftmostInorder(topmostNode.right);
        }

        return topmostNode.val;
    }

    public boolean hasNext() {
        return this.stack.size() > 0;
    }

    private void leftmostInorder(TreeNode root) {
        while (root != null) {
            this.stack.push(root);
            root = root.left;
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
