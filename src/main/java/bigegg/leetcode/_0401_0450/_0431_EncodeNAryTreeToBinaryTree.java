//-----------------------------------------------------------------------------
// Runtime: 1ms
// Memory Usage: 40.5 MB
// Link: https://leetcode.com/submissions/detail/414729755/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0401_0450;

import bigegg.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class _0431_EncodeNAryTreeToBinaryTree {
    // Encodes an n-ary tree to a binary tree.
    public TreeNode encode(Node root) {
        if (root == null) return null;

        TreeNode newRoot = new TreeNode(root.val);

        if (root.children.size() > 0) {
            newRoot.left = encode(root.children.get(0));
        }

        TreeNode sibling = newRoot.left;
        for (int i = 1; i < root.children.size(); i++) {
            sibling.right = encode(root.children.get(i));
            sibling = sibling.right;
        }

        return newRoot;
    }

    // Decodes your binary tree to an n-ary tree.
    public Node decode(TreeNode root) {
        if (root == null) return null;

        Node newRoot = new Node(root.val, new ArrayList<Node>());

        TreeNode sibling = root.left;
        while (sibling != null) {
            newRoot.children.add(decode(sibling));
            sibling = sibling.right;
        }

        return newRoot;
    }

    public class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(root));
