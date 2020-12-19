//-----------------------------------------------------------------------------
// Runtime: 0ms
// Memory Usage: 38.9 MB
// Link: https://leetcode.com/submissions/detail/418203820/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0551_0600;

import bigegg.leetcode.TreeNode;

public class _0563_BinaryTreeTilt {
    private int totalTilt = 0;

    public int findTilt(TreeNode root) {
        computeSum(root);
        return this.totalTilt;
    }

    private int computeSum(TreeNode node) {
        if (node == null)
            return 0;

        int leftSum = computeSum(node.left);
        int rightSum = computeSum(node.right);
        int tilt = Math.abs(leftSum - rightSum);
        this.totalTilt += tilt;

        // return the sum of values starting from this node.
        return node.val + leftSum + rightSum;
    }
}
