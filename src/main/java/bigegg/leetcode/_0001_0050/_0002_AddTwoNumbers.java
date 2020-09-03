//-----------------------------------------------------------------------------
// Runtime: 428ms
// Memory Usage: 
// Link: 
//-----------------------------------------------------------------------------

package bigegg.leetcode._0001_0050;

public final class _0002_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = new ListNode(-1);
        first.next = new ListNode(0);
        ListNode current = first;

        while (l1 != null || l2 != null) {
            int value1 = l1 == null ? 0 : l1.val;
            int value2 = l2 == null ? 0 : l2.val;

            current = current.next;
            int sum = current.val + value1 + value2;
            if (sum >= 10) {
                current.val = sum % 10;
                current.next = new ListNode(1);
            } else {
                current.val = sum;
                current.next = new ListNode(0);
            }

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }

        if (current.next.val == 0) {
            current.next = null;
        }

        return first.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
