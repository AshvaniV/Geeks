//Reverse Level Order Traversal
/*
Given a binary tree of size N, find its reverse level order traversal. ie- the traversal must begin from the last level.
Input :
        1
      /   \
     3     2

Output: 3 2 1
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
 */

package ds99.interview.allLevel;

import java.util.*;

public class Tree2 {
    static class Node {
        int data;
        Node left, right;

        public Node(int key) {
            data = key;
            left = right = null;
        }
    }
    public ArrayList<Integer> reverseLevelOrder(Node node) {
        Queue<Node> Q = new LinkedList<>();
        Stack<Integer> S = new Stack<>();
        ArrayList<Integer> A = new ArrayList<>();
        if (node == null)
            return A;


        Q.add(node);
        while (!Q.isEmpty()) {
            Node temp = Q.poll();
            S.push(temp.data);

            if (temp.right != null)
                Q.add(temp.right);

            if (temp.left != null)
                Q.add(temp.left);
        }
        while (!S.empty()) {
            Integer val = S.pop();
            A.add(val);
        }
        return A;

    }
}
