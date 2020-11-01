//-----------------------------------------------------------------------------
// Runtime: 0ms
// Memory Usage: 36.2 MB
// Link: https://leetcode.com/submissions/detail/415685288/
//-----------------------------------------------------------------------------

package bigegg.leetcode._1251_1300;

import bigegg.leetcode.ListNode;

public class _1290_ConvertBinaryNumberInALinkedListToInteger {
    public int getDecimalValue(ListNode head) {
        int num = head.val;
        while (head.next != null) {
            num = (num << 1) | head.next.val;
            head = head.next;
        }
        return num;
    }
}
