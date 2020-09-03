//-----------------------------------------------------------------------------
// Runtime: 1ms
// Memory Usage: 42.3 MB
// Link: https://leetcode.com/submissions/detail/358258566/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0251_0300;

import bigegg.leetcode.TreeNode;

public class _0287_FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int tortoise = nums[0], hare = nums[0];
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        int ptr1 = nums[0], ptr2 = tortoise;
        while (ptr1 != ptr2) {
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }

        return ptr1;
    }
}
