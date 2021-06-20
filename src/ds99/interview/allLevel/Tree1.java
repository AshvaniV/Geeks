//Level order traversal [Iterative]
package ds99.interview.allLevel;

import java.util.LinkedList;
import java.util.Queue;

public class Tree1 {
    static class Node {
        int data;
        Node left, right;

        public Node(int key) {
            data = key;
            left = right = null;
        }
    }

    static void levelOrder(Node node) {
        if (node == null)
            return;
        Queue<Node> Q = new LinkedList<>();
        Q.add(node);
        while (!Q.isEmpty()) {
            Node temp = Q.poll();
            System.out.print(temp.data + " ");

            if (temp.left != null)
                Q.add(temp.left);

            if (temp.right != null)
                Q.add(temp.right);
        }
    }
}
