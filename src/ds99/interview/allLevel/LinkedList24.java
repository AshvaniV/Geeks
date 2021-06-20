/*Rotate Doubly linked list by N nodes
Input : a  b  c  d  e   N = 2
Output : c  d  e  a  b
*/

package ds99.interview.allLevel;

public class LinkedList24 extends DoublyLinkedListUtils1 {

    //this is not optimized and corner cases are not covered
    static ListNode rotate1(ListNode head, int k) {
        ListNode current = head;
        ListNode newHead = current.next;
        ListNode var1 = current;
        ListNode var2 = current;
        if (head != null && k != 0) {


            for (int i = 1; i < k; i++) {
                var2 = var2.next;
                current = current.next;
                newHead = current.next;
            }
            current.next = null;
            newHead.previous = null;
            var2 = newHead;

            while (var2.next != null) {
                var2 = var2.next;
            }
            var2.next = var1;
        }
        return newHead;
    }


    static void rotate1(int N) {
        if (N == 0)
            return;

        // Let us understand the below code
        // for example N = 2 and
        // list = a <-> b <-> c <-> d <-> e.
        ListNode current = head;

        // current will either point to Nth
        // or NULL after this loop. Current
        // will point to node 'b' in the
        // above example
        int count = 1;
        while (count < N && current != null) {
            current = current.next;
            count++;
        }

        // If current is NULL, N is greater
        // than or equal to count of nodes
        // in linked list. Don't change the
        // list in this case
        if (current == null)
            return;

        // current points to Nth node. Store
        // it in a variable. NthNode points to
        // node 'b' in the above example
        ListNode NthNode = current;

        // current will point to last node
        // after this loop current will point
        // to node 'e' in the above example
        while (current.next != null)
            current = current.next;

        // Change next of last node to previous
        // head. Next of 'e' is now changed to
        // node 'a'
        current.next = head;

        // Change prev of Head node to current
        // Prev of 'a' is now changed to node 'e'
        head.previous = current;

        // Change head to (N+1)th node
        // head is now changed to node 'c'
        head = NthNode.next;

        // Change prev of New Head node to NULL
        // Because Prev of Head Node in Doubly
        // linked list is NULL
        (head).previous = null;

        // change next of Nth node to NULL
        // next of 'b' is now NULL
        NthNode.next = null;
    }


    public static void main(String[] args) {
        LinkedList24 DL = new LinkedList24();
        DL.insertList(10);
        DL.insertList(20);
        DL.insertList(30);
        DL.insertList(40);
        DL.insertList(50);
        DL.displayForward(head);
        ListNode re = rotate1(head, 2);


        DL.displayForward(re);
        DL.displayBackward(re);
    }
}
