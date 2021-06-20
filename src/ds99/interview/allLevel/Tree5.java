package ds99.interview.allLevel;

public class Tree5 {
    static class Node {
        int data;
        Node left, right;

        public Node(int key) {
            data = key;
            left = right = null;
        }
    }

    static void mirrorTree(Node root) {
        if(root == null)
            return;

        mirrorTree(root.left);
        mirrorTree(root.right);
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

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
        inorder(root);
        mirrorTree(root);
        System.out.println("\nmirror tree");
        inorder(root);
    }
}

//Solution
/*In this given example we are using recursion here using mirrorTree(root.left), we are reaching to left of 4 which
is null so recursion call will go to next line mirrorTree(root.right). Now root is 4 and it's left and right both are
null and they will swap using next lines of code.
As we have a recursion tree so call will again go to mirrorTree(root.right), for root 2 [it's left 4 already covered],
now for root 2 we have left as 4 and right as null so they will be swapped. so no 2 is having left null and right 4.
now call will go to root 1 for mirrorTree(root.right) and 1 is having right node this time so it will go to 3.
3 is having left so it will go to 5 and then 7. swap 7's left and right [both are null].
go to 5's right 8 and do swap [both null]. go to 5 and swap 7 and 8.
go back to 3 and then 6. swap 6's left and right [both null], go back to 3 and swap 6 and 6.
go back to 1 and swap 2 and 3.

*/