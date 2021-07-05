//Height of Binary Tree

package ds99.dataStructure.allLevel.tree;

public class Tree3 {
    static class Node {
        int data;
        Node left, right;

        public Node(int key) {
            data = key;
            left = right = null;
        }
    }

    static int height(Node node) {
        if (node == null)
            return -1;
        else {
            int lHeight = height(node.left);
            int rHeight = height(node.right);
            return Math.max(lHeight, rHeight) + 1;
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

        int out = height(root);
        System.out.println(out);
    }
}
