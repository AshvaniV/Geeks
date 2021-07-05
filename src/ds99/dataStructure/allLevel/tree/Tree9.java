//Left View of Binary Tree

package ds99.dataStructure.allLevel.tree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree9 {
    static class Node {
        int data;
        Node left, right;

        // Function to create a new binary tree node having a given key
        public Node(int key) {
            data = key;
            left = right = null;
        }
    }

    static void leftView(Node root) {
        //Step 1: store data into a queue till reach to last node
        if (root == null)
            return;
        else {
            Queue<Node> Q = new LinkedList<>();
            Q.add(root);
            while (!Q.isEmpty()) {
                int size = Q.size();
                for (int i = 0; i < size; i++) {
                    Node currentNode = Q.remove();
                    if (i == 0) {
                        System.out.print(currentNode.data + " ");
                    }
                    if (currentNode.left != null) {
                        Q.add(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        Q.add(currentNode.right);
                    }
                }
            }
        }
    }
}
