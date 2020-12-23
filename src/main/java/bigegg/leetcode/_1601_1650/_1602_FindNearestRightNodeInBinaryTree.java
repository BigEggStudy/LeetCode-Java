//-----------------------------------------------------------------------------
// Runtime: 8ms
// Memory Usage: 50.4 MB
// Link: https://leetcode.com/submissions/detail/433534391/
//-----------------------------------------------------------------------------

package bigegg.leetcode._1601_1650;

import bigegg.leetcode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class _1602_FindNearestRightNodeInBinaryTree {
    public TreeNode findNearestRightNode(TreeNode root, TreeNode u) {
        if (root == null) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode curr = queue.poll();

                if (curr == u) {
                    if (i == levelSize - 1)
                        return null;
                    else
                        return queue.poll();
                }

                if (curr.left != null) queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);
            }
        }
        return null;
    }
}
