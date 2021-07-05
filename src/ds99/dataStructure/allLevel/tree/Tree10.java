//Right View of Binary Tree
package ds99.dataStructure.allLevel.tree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree10 {
    static class Node {
        int data;
        Node left, right;

        // Function to create a new binary tree node having a given key
        public Node(int key) {
            data = key;
            left = right = null;
        }
    }

    void rightView(Node root) {
        if (root == null)
            return;

        Queue<Node> Q = new LinkedList<>();
        Q.add(root);
        while (!Q.isEmpty()) {

            int size = Q.size();
            for (int i = 1; i <= size; i++) {
                Node n = Q.remove();
                if (i == size) {
                    System.out.print(n.data + " ");
                }

                if (n.left != null)
                    Q.add(n.left);
                if (n.right != null)
                    Q.add(n.right);

            }
        }
    }

}
