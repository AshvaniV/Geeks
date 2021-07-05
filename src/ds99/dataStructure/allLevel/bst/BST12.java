//Kth largest element in BST
package ds99.dataStructure.allLevel.bst;

public class BST12 {
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    int count = 0;
    int result;


    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node node, int k) {

        if (node == null || count > k)
            return count;

        kthLargest(node.right, k);
        count++;
        if (count == k) {

            result = node.data;
        }
        kthLargest(node.left, k);
        return result;
    }

}
