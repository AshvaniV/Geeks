//Lowest Common Ancestor in a BST
package ds99.dataStructure.allLevel.bst;

public class BST7 {
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    Node lca(Node root, int n1, int n2) {
        if (root == null)
            return root;
        if (root.data > n1 && root.data > n2) {
            lca(root.left, n1, n2);
        }
        if (root.data < n1 && root.data < n2) {
            lca(root.right, n1, n2);
        }
        return root;

    }
}
