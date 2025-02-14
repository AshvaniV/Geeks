//InOrder traversal: left -> root -> right
package ds99.dataStructure.allLevel.tree;

import java.util.Stack;

public class Tree6 {
    static class Node {
        int data;
        Node left, right;

        // Function to create a new binary tree node having a given key
        public Node(int key) {
            data = key;
            left = right = null;
        }
    }

    public static void inorder(Node root) {
        // return if the current node is empty
        if (root == null) {
            return;
        }

        // Traverse the left subtree
        inorder(root.left);

        // Display the data part of the root (or current node)
        System.out.print(root.data + " ");

        // Traverse the right subtree
        inorder(root.right);
    }

    // Iterative function to perform inorder traversal on the tree
    public static void inorderIterative(Node root) {

        // return if the tree is empty
        if (root == null) {
            return;
        }
        // create an empty stack
        Stack<Node> stack = new Stack<>();

        // start from the root node (set current node to the root node)
        Node curr = root;

        // if the current node is null and the stack is also empty, we are done. If any of these condition exist then
        //we traverse till data exist for these conditions
        while (!stack.empty() || curr != null) {
            // if the current node exists, push it into the stack (defer it)
            // and move to its left child. This condition will continue until we find left most last node> so we will
            //start printing from this node
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                // otherwise, if the current node is null, pop an element from
                // the stack, print it, and finally set the current node to its
                // right child
                curr = stack.pop();
                System.out.print(curr.data + " ");

                curr = curr.right;
            }
        }
    }

    public static void main(String[] args) {
        /* Construct the following tree
                   1
                 /   \
                /     \
               2       3
              /      /   \
             /      /     \
            4      5       6
                  / \
                 /   \
                7     8
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);

        inorderIterative(root); //4 2 1 7 5 8 3 6
    }
}
