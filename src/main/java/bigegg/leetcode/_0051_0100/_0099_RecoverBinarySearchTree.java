//-----------------------------------------------------------------------------
// Runtime: 3ms
// Memory Usage: 39.2 MB
// Link: https://leetcode.com/submissions/detail/415314453/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0051_0100;

import bigegg.leetcode.TreeNode;

import java.util.Stack;

public class _0099_RecoverBinarySearchTree {
    private final Stack<TreeNode> stack = new Stack<>();
    private TreeNode prev = null;
    private TreeNode first = null;
    private TreeNode second = null;
    private TreeNode current = null;

    public void recoverTree(TreeNode root) {
        current = root;
        while (stack.size() > 0 || current != null)
        {
            while (current != null)
            {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            if (prev != null && current.val < prev.val)
            {
                if (first == null) first = prev;
                second = current;
            }
            if (first != null && first.val < current.val) break;

            prev = current;
            current = current.right;
        }

        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

}
