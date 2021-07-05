//Minimum element in BST
package ds99.dataStructure.allLevel.bst;

public class BST3 {
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }
    int minValue(Node node)
    {
        int minValue = -1;
        if(node.left == null)
            minValue = node.data;

        while(node.left != null)
        {
            minValue = node.left.data;
            node = node.left;
        }
        return minValue;
    }
}
