//-----------------------------------------------------------------------------
// Runtime: 27ms
// Memory Usage: 53.8 MB
// Link: https://leetcode.com/submissions/detail/432532093/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0201_0250;

import java.util.ArrayDeque;

public class _0239_SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n * k == 0) return new int[0];
        if (k == 1) return nums;

        ArrayDeque<Integer> deq = new ArrayDeque<Integer>();
        int max_idx = 0;
        for (int i = 0; i < k; i++) {
            updateDeque(nums, i, k, deq);
        }

        int [] output = new int[n - k + 1];
        output[0] = nums[deq.getFirst()];

        for (int i = k; i < n; i++) {
            updateDeque(nums, i, k, deq);
            output[i - k + 1] = nums[deq.getFirst()];
        }
        return output;
    }

    private void updateDeque(int[] nums, int i, int k, ArrayDeque<Integer> deq) {
        if (!deq.isEmpty() && deq.getFirst() == i - k)
            deq.removeFirst();

        while (!deq.isEmpty() && nums[i] > nums[deq.getLast()])
            deq.removeLast();

        deq.addLast(i);
    }
}
