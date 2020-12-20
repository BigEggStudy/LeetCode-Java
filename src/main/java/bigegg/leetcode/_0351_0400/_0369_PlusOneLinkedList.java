//-----------------------------------------------------------------------------
// Runtime: 0ms
// Memory Usage: 36.8 mb
// Link: https://leetcode.com/submissions/detail/431044215/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0351_0400;

import bigegg.leetcode.ListNode;

public class _0369_PlusOneLinkedList {
    public ListNode plusOne(ListNode head) {
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;
        ListNode notNine = sentinel;

        while (head != null) {
            if (head.val != 9) notNine = head;
            head = head.next;
        }

        notNine.val++;
        notNine = notNine.next;

        while (notNine != null) {
            notNine.val = 0;
            notNine = notNine.next;
        }

        return sentinel.val != 0 ? sentinel : sentinel.next;
    }
}
