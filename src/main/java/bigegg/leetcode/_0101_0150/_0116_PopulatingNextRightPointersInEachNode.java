//-----------------------------------------------------------------------------
// Runtime: 0ms
// Memory Usage: 39.1 MB
// Link: https://leetcode.com/submissions/detail/419973855/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0101_0150;

/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

public class _0116_PopulatingNextRightPointersInEachNode {
    public Node connect(Node root) {
        if (root == null)
            return root;

        Node leftmost = root;
        while (leftmost.left != null) {
            Node head = leftmost;

            while (head != null) {
                head.left.next = head.right;
                if (head.next != null)
                    head.right.next = head.next.left;

                head = head.next;
            }

            leftmost = leftmost.left;
        }

        return root;
    }

    public class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
}
