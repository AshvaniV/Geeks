//Given a binary tree. Check whether it is a BST or not.
package ds99.dataStructure.allLevel.bst;

import java.util.ArrayList;
import java.util.List;

public class BST5 {
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    void inorder(Node node, List<Integer> list) {
        if (node != null) {
            inorder(node.left, list);
            list.add(node.data);
            inorder(node.right, list);
        }
    }

    boolean isBST(Node root) {
        if (root == null) {
            return false;
        }
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        for (int i = 1; i < list.size(); i++) {
            if (!(list.get(i) > list.get(i - 1))) {
                return false;
            }
        }
        return true;
    }
}
