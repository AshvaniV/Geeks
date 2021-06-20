/*
This qn may be asked in 2 ways:
 Nth node from end of linked list
 remove nth node from end of linked list */

package ds99.interview.allLevel;

public class LinkedList32 {
    int getNthFromLast(Node head, int k) {
    /*    if(head == null || head.next == null)
        return head.data;*/
        Node dummy = new Node(-1);
        dummy.next = head;
        Node left = dummy;
        Node right = dummy.next;
        while (k > 1) {
            //when kth value is more than no of element in LL then below condition will fail
            if (right.next == null)
                return -1;
            right = right.next;
            k--;
        }

        while (right.next != null) {
            left = left.next;
            right = right.next;
        }
        return left.next.data;
    }
}
