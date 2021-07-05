package ds99.dataStructure.allLevel.bst;

import java.util.ArrayList;

public class BST11 {
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    ArrayList<Integer> storeInorder(Node node) {
        ArrayList<Integer> list1 = new ArrayList<>();
        return storeInorderUtil(node, list1);
    }

    public ArrayList<Integer> storeInorderUtil(Node node, ArrayList<Integer> list) {
        if (node == null)
            return list;

        storeInorderUtil(node.left, list);
        list.add(node.data);
        storeInorderUtil(node.right, list);
        return list;
    }

    ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2, int m, int n) {
        ArrayList<Integer> list3 = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (list1.get(i) < list2.get(j)) {
                list3.add(list1.get(i));
                i++;
            } else {
                list3.add(list2.get(j));
                j++;
            }
        }

        while (i < m) {
            list3.add(list1.get(i));
            i++;
        }

        while (j < n) {
            list3.add(list2.get(j));
            j++;
        }
        return list3;
    }

    Node ALtoBST(ArrayList<Integer> list, int start, int end) {
        // Base case
        if (start > end)
            return null;

        // Get the middle element and make it root
        int mid = (start + end) / 2;
        Node node = new Node(list.get(mid));

        node.left = ALtoBST(list, start, mid - 1);
        node.right = ALtoBST(list, mid + 1, end);

        return node;
    }


    Node mergeTrees(Node node1, Node node2) {
        //Stores Inorder of tree1 to list1
        ArrayList<Integer> list1 = storeInorder(node1);

        //Stores Inorder of tree2 to list2
        ArrayList<Integer> list2 = storeInorder(node2);

        // Merges both list1 and list2 into list3
        ArrayList<Integer> list3 = merge(list1, list2, list1.size(), list2.size());

        //Eventually converts the merged list into resultant BST
        Node node = ALtoBST(list3, 0, list3.size() - 1);
        return node;
    }
}
