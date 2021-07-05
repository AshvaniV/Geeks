//Tree is heightBalanced or not
/*A tree is height balanced if difference between heights of left and right subtrees is not more than one for
all nodes of tree. */

package ds99.dataStructure.allLevel.tree;

public class Tree14 {
    static class Node {
        int data;
        Node left, right;

        public Node(int key) {
            data = key;
            left = right = null;
        }
    }

    static int height(Node root) {
        if (root == null)
            return 0;
        int leftH = height(root.left);
        int rightH = height(root.right);

        return Math.max(leftH, rightH) + 1;
    }

    boolean isBalanced(Node root) {
        if (root == null)
            return true;

        int lt = height(root.left);
        int rt = height(root.right);

        if ((Math.abs(lt - rt) <= 1)
                && isBalanced(root.left)
                && isBalanced(root.right))
            return true;

        return false;
    }
}
