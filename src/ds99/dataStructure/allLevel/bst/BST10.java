//Convert a normal BST to Balanced BST
//We can also use this approach to create a Balanced BST from sorted array
package ds99.dataStructure.allLevel.bst;

import java.util.ArrayList;

public class BST10 {
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    Node root;

        void storeBSTNodesInInorder(Node root, ArrayList<Node> nodes) {
            if (root == null)
                return;

            storeBSTNodesInInorder(root.left, nodes);
            nodes.add(root);
            storeBSTNodesInInorder(root.right, nodes);
        }

    Node buildBalancedBSTUtil(ArrayList<Node> nodes, int start,
                       int end) {
        if (start > end)
            return null;

        int mid = (start + end) / 2;
        Node node = nodes.get(mid);

        node.left = buildBalancedBSTUtil(nodes, start, mid - 1);
        node.right = buildBalancedBSTUtil(nodes, mid + 1, end);

        return node;
    }

    Node buildTree(Node root) {
        ArrayList<Node> nodes = new ArrayList<Node>();
        storeBSTNodesInInorder(root, nodes);
        int n = nodes.size();
        return buildBalancedBSTUtil(nodes, 0, n - 1);
    }
}
