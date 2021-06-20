//Clone a linked list with next and random pointer
/*
Expected Time Complexity : O(n)
Expected Auxiliary Space : O(1)
but this solution is taking O(n) space
*/
package ds99.interview.allLevel;

import java.util.HashMap;

public class LinkedList28 {
    class Node {
        int data;
        Node next, arb;

        Node(int d) {
            next = arb = null;
        }
    }

    Node copyList(Node head) {
        Node temp = head;
        HashMap<Node, Node> map = new HashMap<>();
        Node n = null;
        while (temp != null) {
            n = new Node(temp.data);
            map.put(temp, n);
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            n = map.get(temp);
            n.next = map.get(temp.next);
            n.arb = map.get(temp.arb);
            temp = temp.next;
        }
        return map.get(head);
    }
}
