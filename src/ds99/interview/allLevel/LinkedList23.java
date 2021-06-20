/*Sort a k sorted doubly linked list
Given a doubly linked list containing n nodes, where each node is at most k away from its target position in the list.
The problem is to sort the given doubly linked list.
For example, let us consider k is 2, a node at position 7 in the sorted doubly linked list,
can be at positions 5, 6, 7, 8, 9 in the given doubly linked list.
*/

package ds99.interview.allLevel;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LinkedList23 extends DoublyLinkedListUtils1 {
    class compareNode implements Comparator<ListNode> {
        public int compare(ListNode n1, ListNode n2) {
            return n1.data - n2.data;
        }
    }

    // function to sort a k sorted doubly linked list
    ListNode sortAKSortedDLL(ListNode head, int k) {

        // if list is empty
        if (head == null)
            return head;

        // priority_queue 'pq' implemented as min heap with the
        // help of 'compare' function in compare ListNode class
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(new compareNode());

        ListNode newHead = null, last = null;

        // Create a Min Heap of first (k+1) elements from
        // input doubly linked list
        for (int i = 0; head != null && i <= k; i++) {

            // push the node on to 'pq'
            pq.add(head);

            // move to the next node
            head = head.next;
        }

        // loop till there are elements in 'pq'
        while (!pq.isEmpty()) {

            // place root or top of 'pq' at the end of the
            // result sorted list so far having the first node
            // pointed to by 'newHead'
            // and adjust the required links
            if (newHead == null) {
                newHead = pq.peek();
                newHead.previous = null;

                // 'last' points to the last node
                // of the result sorted list so far
                last = newHead;
            } else {
                last.next = pq.peek();
                pq.peek().previous = last;
                last = pq.peek();
            }

            // remove element from 'pq'
            pq.poll();

            // if there are more nodes left in the input list
            if (head != null) {

                // push the node on to 'pq'
                pq.add(head);

                // move to the next node
                head = head.next;
            }
        }
        // making 'next' of last node point to NULL
        last.next = null;

        // new head of the required sorted DLL
        return newHead;
    }

}


/*
We can sort the list using the MIN HEAP data structure. The approach has been explained in Sort a nearly sorted
(or K sorted) array. We only have to be careful while traversing the input doubly linked list and adjusting the
required next and previous links in the final sorted list.
 */
