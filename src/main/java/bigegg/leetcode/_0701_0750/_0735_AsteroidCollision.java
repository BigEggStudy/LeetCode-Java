//-----------------------------------------------------------------------------
// Runtime: 4ms
// Memory Usage: 39.6 MB
// Link: https://leetcode.com/submissions/detail/411589048/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0701_0750;

import java.util.Stack;

public class _0735_AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack();
        for (int asteroid : asteroids) {
            boolean collide = false;

            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                if (stack.peek() + asteroid < 0) {
                    stack.pop();
                    continue;
                } else if (stack.peek() + asteroid == 0)
                    stack.pop();

                collide = true;
                break;
            }

            if (!collide)
                stack.push(asteroid);
        }

        int[] results = new int[stack.size()];
        for (int i = results.length - 1; i >= 0; i--)
            results[i] = stack.pop();

        return results;
    }
}
