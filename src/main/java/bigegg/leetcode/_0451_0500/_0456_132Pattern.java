//-----------------------------------------------------------------------------
// Runtime: 3ms
// Memory Usage: 39.8 MB
// Link: https://leetcode.com/submissions/detail/412334901/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0451_0500;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class _0456_132Pattern {
    public boolean find132pattern(int[] nums) {
        if (nums.length < 3) return false;

        int[] min = new int[nums.length];
        min[0] = nums[0];
        for (int i = 1; i < nums.length; i++)
            min[i] = Math.min(min[i - 1], nums[i]);

        Stack<Integer> stack = new Stack<>();
        for (int j = nums.length - 1; j >= 0; j--) {
            if (nums[j] == min[j]) continue;

            while (!stack.isEmpty() && stack.peek() <= min[j])
                stack.pop();
            if (!stack.isEmpty() && stack.peek() < nums[j])
                return true;
            stack.push(nums[j]);
        }

        return false;
    }
}
