//Bottom view
package ds99.dataStructure.allLevel.tree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class Tree12 {

    static class Node {
        int data;
        Node left, right;

        public Node(int key) {
            data = key;
            left = right = null;
        }
    }
    // Should print bottom view of tree with given root
    public void bottomView(Node root)
    {
        class qNode{
            Node node;
            int hd;
            qNode(Node n, int h){
                node = n;
                hd = h;
            }
        }
        Queue<qNode> q = new LinkedList<>();
        Map<Integer, Node> map = new TreeMap<>();

        q.add(new qNode(root, 0));
        qNode tmp;
        while(!q.isEmpty()){
            tmp = q.poll();

            //insert value each time so at end it will have last values of each horizontalDistance
            map.put(tmp.hd, tmp.node);
            if(tmp.node.left != null)
                q.add(new qNode(tmp.node.left, tmp.hd - 1));
            if(tmp.node.right != null)
                q.add(new qNode(tmp.node.right, tmp.hd + 1));
        }

        StringBuilder s = new StringBuilder();
        for(Map.Entry<Integer, Node> m : map.entrySet())
            s.append(m.getValue().data + " ");

        System.out.print(s);

    }
}
