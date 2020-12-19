//-----------------------------------------------------------------------------
// Runtime: 2ms
// Memory Usage: 39.1 MB
// Link: https://leetcode.com/submissions/detail/432177919/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0401_0450;

import bigegg.leetcode.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class _0445_AddTwoNumbersII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverseList(l1);
        l2 = reverseList(l2);

        ListNode head = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x1 = l1 != null ? l1.val : 0;
            int x2 = l2 != null ? l2.val : 0;

            int val = (carry + x1 + x2) % 10;
            carry = (carry + x1 + x2) / 10;

            ListNode curr = new ListNode(val);
            curr.next = head;
            head = curr;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        if (carry != 0) {
            ListNode curr = new ListNode(carry);
            curr.next = head;
            head = curr;
        }

        return head;
    }

    private ListNode reverseList(ListNode head) {
        ListNode newHead = new ListNode();
        while (head != null) {
            ListNode tmp = head.next;
            head.next = newHead.next;
            newHead.next = head;
            head = tmp;
        }
        return newHead.next;
    }
}
