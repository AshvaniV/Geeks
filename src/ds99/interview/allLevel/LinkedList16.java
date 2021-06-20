//check for circular linked list
package ds99.interview.allLevel;

public class LinkedList16 {
    boolean isCircular(Node head)
    {
        Node cur = head.next;
        while( cur != null) {
            if(cur == head)
                return true;
            cur = cur.next;
        }
        return false;
    }
}
