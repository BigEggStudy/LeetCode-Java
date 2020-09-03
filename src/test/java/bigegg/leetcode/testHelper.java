package bigegg.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class testHelper {
    public static TreeNode GenerateTree(Integer[] nums)
    {
        if (nums == null || nums.length == 0) { return null; }

        int i = 0;
        TreeNode first = new TreeNode(nums[i++].intValue());
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(first);

        while (queue.size() > 0)
        {
            TreeNode current = queue.remove();
            if (i < nums.length && nums[i] != null)
            {
                TreeNode node = new TreeNode(nums[i].intValue());
                current.left = node;
                queue.add(node);
            }
            if (i + 1 < nums.length && nums[i + 1] != null)
            {
                TreeNode node = new TreeNode(nums[i + 1].intValue());
                current.right = node;
                queue.add(node);
            }
            i += 2;
        }

        return first;
    }
}
