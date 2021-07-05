package ds99.dataStructure.allLevel.bst;

public class BST1 {

    static class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    static Node root;

    BST1() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
        return root;
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " -->");
            inorderRec(root.right);
        }
    }

    public Node search(Node root, int key) {
        // Base Cases: root is null or key is present at root
        if (root == null || root.key == key)
            return root;

        // Key is greater than root's key
        if (root.key < key)
            return search(root.right, key);

        // Key is smaller than root's key
        return search(root.left, key);
    }

    static Node delete(Node root, int data) {
        if (root == null)
            return null;

        else if (data < root.key)
            root.left = delete(root.left, data);

        else if (data > root.key)
            root.right = delete(root.right, data);

            //else condition will reach once we found the key which need to be deleted so
        else {
            //we can handle 3 cases together like, root has only one child either left or right or no child
            if (root.left == null)
                return root.right;

            else if (root.right == null)
                return root.left;
            //root with 2 children, find smallest from right subtree and make it connecting node
            root.key = minFromRight(root.right);

            //now we have connected smallest node from right subtree at place where we have data which need to be deleted
            //so min key form right subtree will be present 2 times at this state.
            //Again scenario will be this key will be either a leaf node or will be having max 1 child so we can delete
            //it using our earlier code.
            root.right = delete(root.right, root.key);

            //now we have smallest key assigned on place where deleted key was present so now
        }
        return root;
    }

    //we know that in right subtree, smallest element will always be in left side
    static int minFromRight(Node root) {
        int minValue = root.key;
        while (root.left != null) {
            minValue = root.left.key;
            root = root.left;
        }
        return minValue;
    }




    /* A helper function to count nodes in a Binary Tree */
    static int countNodes(Node root)
    {
        if (root == null)
            return 0;
        return countNodes(root.left) + countNodes(root.right) + 1;
    }

    public static void main(String[] args) {
        BST1 tree = new BST1();

        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // print inorder traversal of the BST
        tree.inorder();

        //tree.search(root, 50);

        int data = 50;
        System.out.println("\ndeleting " + data + " from tree");
        delete(root, data);
        tree.inorder();

    }
}
