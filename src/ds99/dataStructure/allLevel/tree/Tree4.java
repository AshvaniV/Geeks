/*find diameter of it.
The diameter of a tree is the number of nodes on the longest path between two end nodes in the tree.*/

package ds99.dataStructure.allLevel.tree;

public class Tree4 {
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
            return 0;
        //Here we are counting nodes, not edges that's why we are returning 0 instead of -1.
        else {
            int lHeight = height(node.left);
            int rHeight = height(node.right);
            return Math.max(lHeight, rHeight) + 1;
        }
    }

    static int diameter(Node root)
    {
        if(root == null)
            return 0;
        //if diameter is coming using root, then find left height and right height and add 1 for root
        int lHeight = height(root.left);
        int rHeight = height(root.right);

        //suppose diameter is not using root then we have to consider the diameter of left and right subtree
        int lDiameter = diameter(root.left);
        int rDiameter = diameter(root.right);

        return Math.max(lHeight + rHeight +1, Math.max(lDiameter, rDiameter));
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
/*        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);*/

        int out = diameter(root);
        System.out.println(out);
    }
}
