package ds99.dataStructure.allLevel.linkeedList;

import java.util.HashSet;

public class LinkedList12 extends LinkedListUtils1 {

    int intersectPoint(Node head1, Node head2) {
        if (head1 == null || head2 == null)
            return -1;

        HashSet<Node> HS = new HashSet<>();

        while (head1 != null) {
            HS.add(head1);
            head1 = head1.next;
        }

        while (head2 != null) {
            if (HS.contains(head2))
                return head2.data;

            HS.add(head2);
            head2 = head2.next;
        }
        return -1;
    }
}
