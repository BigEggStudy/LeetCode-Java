//-----------------------------------------------------------------------------
// Runtime: 28ms
// Memory Usage: 38.7 MB
// Link: https://leetcode.com/submissions/detail/416091805/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0101_0150;

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
public class _0147_InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummyHead = new ListNode();
        ListNode curr = head, prevNode, nextNode;

        while (curr != null) {
            prevNode = dummyHead;
            nextNode = dummyHead.next;

            while (nextNode != null) {
                if (curr.val < nextNode.val)
                    break;
                prevNode = nextNode;
                nextNode = nextNode.next;
            }
            ListNode nextIter = curr.next;
            curr.next = nextNode;
            prevNode.next = curr;

            curr = nextIter;
        }

        return dummyHead.next;
    }
}
