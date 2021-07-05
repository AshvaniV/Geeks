/*Count triplets in a sorted doubly linked list whose sum is equal to a given value x

Given a sorted doubly linked list of distinct nodes(no two nodes have the same data) and a value x.
Count triplets in the list that sum up to a given value x.
Time Complexity: O(n2)
Auxiliary Space: O(1)
*/

package ds99.dataStructure.allLevel.linkeedList;

public class LinkedList22 extends DoublyLinkedListUtils1 {
    // function to count triplets in a sorted doubly linked list
// whose sum is equal to a given value 'x'
    static int countTriplets(ListNode head, int x) {
        // if list is empty
        if (head == null)
            return 0;

        ListNode current, first, last;
        int count = 0;

        // get pointer to the last node of
        // the doubly linked list
        last = head;
        while (last.next != null)
            last = last.next;

        // traversing the doubly linked list
        for (current = head; current != null; current = current.next) {

            // for each current node
            first = current.next;

            // count pairs with sum(x - current.data) in the range
            // first to last and add it to the 'count' of triplets
            count += countPairs(first, last, x - current.data);
        }

        // required count of triplets
        return count;
    }


    static int countPairs(ListNode first, ListNode second, int value) {
        int count = 0;

        // The loop terminates when either of two pointers
        // become null, or they cross each other (second.next
        // == first), or they become same (first == second)
        while (first != null && second != null &&
                first != second && second.next != first) {

            // pair found
            if ((first.data + second.data) == value) {

                // increment count
                count++;

                // move first in forward direction
                first = first.next;

                // move second in backward direction
                second = second.previous;
            }

            // if sum is greater than 'value'
            // move second in backward direction
            else if ((first.data + second.data) > value)
                second = second.previous;

                // else move first in forward direction
            else
                first = first.next;
        }

        // required count of pairs
        return count;
    }

}
/*Traverse the doubly linked list from left to right. For each current node during the traversal, initialize two pointers
first = pointer to the node next to the current node and last = pointer to the last node of the list. Now, count pairs
in the list from first to last pointer that sum up to value (x – current node’s data).
Add this count to the total_count of triplets. Pointer to the last node can be found only once in the beginning.
 */