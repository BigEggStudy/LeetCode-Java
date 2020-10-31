//-----------------------------------------------------------------------------
// Runtime: 0ms
// Memory Usage: 39.2 MB
// Link: https://leetcode.com/submissions/detail/413898389/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0101_0150;

import bigegg.leetcode.ListNode;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class _0142_LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;

        ListNode intersect = getIntersect(head);
        if (intersect == null) return null;

        ListNode ptr = head;
        while (ptr != intersect) {
            ptr = ptr.next;
            intersect = intersect.next;
        }

        return ptr;
    }

    private ListNode getIntersect(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow)
                return fast;
        }

        return null;
    }
}
