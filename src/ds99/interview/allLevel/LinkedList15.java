//middle of LinkedList
package ds99.interview.allLevel;

public class LinkedList15 extends LinkedListUtils1 {
    public Node middleNode(Node head) {
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }
}
