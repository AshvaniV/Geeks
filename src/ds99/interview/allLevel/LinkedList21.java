//Find pairs with given sum in sorted doubly linked list
/*Time complexity : O(n)
Auxiliary space : O(1)*/
package ds99.interview.allLevel;

public class LinkedList21 extends DoublyLinkedListUtils1 {
    static void pairSum(ListNode head, int x) {
        // Set two pointers, first
        // to the beginning of DLL
        // and second to the end of DLL.
        ListNode first = head;
        ListNode second = head;
        while (second.next != null)
            second = second.next;

        // To track if we find a pair or not
        boolean found = false;

        // The loop terminates when
        // they cross each other (second.next
        // == first), or they become same
        // (first == second)
        while (first != second && second.next != first) {
            // pair found
            if ((first.data + second.data) == x) {
                found = true;
                System.out.println("(" + first.data +
                        ", " + second.data + ")");

                // move first in forward direction
                first = first.next;

                // move second in backward direction
                second = second.previous;
            } else {
                if ((first.data + second.data) < x)
                    first = first.next;
                else
                    second = second.previous;
            }
        }

        // if pair is not present
        if (!found)
            System.out.println("No pair found");
    }
}
