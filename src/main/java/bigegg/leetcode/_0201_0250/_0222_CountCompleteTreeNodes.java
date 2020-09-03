//-----------------------------------------------------------------------------
// Runtime: 0ms
// Memory Usage: 
// Link: 
//-----------------------------------------------------------------------------

package bigegg.leetcode._0201_0250;

import bigegg.leetcode.TreeNode;

public class _0222_CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        int d = computeDepth((root));
        if (d == 0) return 1;

        int left = 1, right = (int)Math.pow(2, d) - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (checkExisted(root, d, mid)) left = mid + 1;
            else right = mid - 1;
        }
        return (int)Math.pow(2, d) - 1 + left;
    }

    private boolean checkExisted(TreeNode node, int d, int index) {
        int left = 0, right = (int)Math.pow(2, d) - 1;
        for (int i = 0; i < d; i++) {
            int mid = left + (right - left) / 2;
            if (mid >= index) {
                node = node.left;
                right = mid;
            }
            else {
                node = node.right;
                left = mid + 1;
            }
        }
        return node != null;
    }

    private int computeDepth(TreeNode node) {
        int depth = 0;
        while (node.left != null) {
            node = node.left;
            depth++;
        }
        return depth;
    }
}
