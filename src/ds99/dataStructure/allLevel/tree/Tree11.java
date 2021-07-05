//Top view

package ds99.dataStructure.allLevel.tree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class Tree11 {
    static class Node {
        int data;
        Node left, right;

        public Node(int key) {
            data = key;
            left = right = null;
        }
    }

    static void topView(Node root) {

        class QNode {
            Node node;
            int hd;
            QNode(Node n, int h) {
                node = n;
                hd = h;
            }
        }

        Queue<QNode> q = new LinkedList<>();
        Map<Integer, Node> map = new TreeMap<>();

        q.add(new QNode(root, 0));
        QNode tmp;
        
        while (!q.isEmpty()) {
            tmp = q.poll();
            if (!map.containsKey(tmp.hd))
                map.put(tmp.hd, tmp.node);

            if (tmp.node.left != null)
                q.add(new QNode(tmp.node.left, tmp.hd - 1));

            if (tmp.node.right != null)
                q.add(new QNode(tmp.node.right, tmp.hd + 1));
        }

        StringBuilder s = new StringBuilder();
        for (Map.Entry<Integer, Node> m : map.entrySet())
            s.append(m.getValue().data + " ");

        System.out.print(s);
    }
}
/*Logic
We are using this question using vertical view of tree where we have a Map which keys are horizontalDistance of any
node and value are a list of nodes on this horizontalDistance.
Here are to check only first key coming on a horizontalDistance that's why we are maintaining a Node as value instead
of list of nodes.
We are inserting values in map only once new horizontalDistance is coming and at last we will be having all horizontalD
in sorted order and their corresponding values.
* */
