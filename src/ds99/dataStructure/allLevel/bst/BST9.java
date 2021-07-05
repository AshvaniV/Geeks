/*Given a Binary Tree, convert it to Binary Search Tree in such a way that keeps the original structure of Binary Tree
 intact.*/
package ds99.dataStructure.allLevel.bst;

import java.util.ArrayList;
import java.util.Collections;

public class BST9 {
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    ArrayList<Integer> al = new ArrayList<>();
    int i = 0;

    Node binaryTreeToBST(Node root) {
        inorder(root);
        Collections.sort(al);
        inorderinsert(root);
        return root;
    }

    void inorderinsert(Node root) {
        if (root == null) return;
        inorderinsert(root.left);
        root.data = al.get(i++);
        inorderinsert(root.right);
    }

    void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        al.add(root.data);
        inorder(root.right);
    }
}
