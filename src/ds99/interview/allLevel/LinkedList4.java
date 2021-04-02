//*******************IMP: Remove loop in Linked List******
/*You are given a linked list of N nodes. The task is to remove the loop from the linked list, if present.*/

package ds99.interview.allLevel;

import java.util.HashSet;

public class LinkedList4 {
    public static Node firstNodeOfLoopUsingHashing(Node head) {
        HashSet<Node> HS = new HashSet<>();
        Node temp = head;
        //If there is no loop then temp will definitely reach to null at some time. If loop exist then it will break once reach to same node again.

        while (temp != null) {
            if (HS.contains(temp)) {
                return temp;
            }
            HS.add(temp);
            temp = temp.next;
        }
        return null;
    }

    public static void removeLoopUsingHashing(Node head) {
        HashSet<Node> HS = new HashSet<>();
        Node temp = head;
        Node prev = null;
        //If there is no loop then temp will definitely reach to null at some time. If loop exist then it will break once reach to same node again.
        //previous element should be store to remove the loop by making prev.next as null.
        while (temp != null) {
            if (HS.contains(temp)) {
                prev.next = null;
                break;
            }
            HS.add(temp);
            prev = temp;
            temp = temp.next;
        }
    }
}

//If we detect a loop means at that node we have a connection with any of previous node, we need to remove this connection