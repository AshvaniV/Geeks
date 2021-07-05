//Length of loop and first node of loop
//****************Floyd Cycle Detection algorithm******************
package ds99.dataStructure.allLevel.linkeedList;

import java.util.HashSet;

public class LinkedList5 {
    private static int loopLength(Node head) {
        //check whether we have loop present or not
        Node slow = head;
        Node fast = head;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return countNodes(slow);
        }
        return 0;
    }

    private static int countNodes(Node head) {
        //we will have loop which length will be at least 1
        int loopLength = 1;
        Node tempNode = head;
        while (tempNode.next != head) {
            loopLength++;
            tempNode = tempNode.next;
        }
        return loopLength;
    }


    private Node firstNodeOfLoop(Node head) {
        if (head == null || head.next == null)
            return null;                     //no loop detected
        Node slow = head;
        Node fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return slow;               //we found a loop so return first node of loop
            }
        }
        return null;
    }


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
}
