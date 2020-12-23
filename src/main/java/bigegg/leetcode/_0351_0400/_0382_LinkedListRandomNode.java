//-----------------------------------------------------------------------------
// Runtime: 16ms
// Memory Usage: 40.4 mb
// Link: https://leetcode.com/submissions/detail/433807012/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0351_0400;

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
public class _0382_LinkedListRandomNode {
    private ListNode head;

    /** @param head The linked list's head.
    Note that the head is guaranteed to be not null, so it contains at least one node. */
    public _0382_LinkedListRandomNode(ListNode head) {
        this.head = head;
    }

    /** Returns a random node's value. */
    public int getRandom() {
        int scope = 1, chosenValue = 0;
        ListNode curr = this.head;
        while (curr != null) {
            if (Math.random() < 1.0 / scope)
                chosenValue = curr.val;
            scope += 1;
            curr = curr.next;
        }
        return chosenValue;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
