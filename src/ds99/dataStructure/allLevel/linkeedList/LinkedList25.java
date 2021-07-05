package ds99.dataStructure.allLevel.linkeedList;

public class LinkedList25 extends DoublyLinkedListUtils1{
    // function to insert a node at the beginning
    // of the Doubly Linked List
    static ListNode push(ListNode head, ListNode new_node)
    {
        // since we are adding at the beginning,
        // prev is always NULL
        new_node.previous = null;

        // link the old list off the new node
        new_node.next = head;

        // change prev of head node to new node
        if (head != null)
            head.previous = new_node;

        // move the head to point to the new node
        head = new_node;
        return head;
    }

    // function to reverse a doubly linked list
    // in groups of given size
    static ListNode revListInGroupOfGivenSize(ListNode head, int k)
    {
        ListNode current = head;
        ListNode next = null;
        ListNode newHead = null;
        int count = 0;

        // reversing the current group of k
        // or less than k nodes by adding
        // them at the beginning of list
        // 'newHead'
        while (current != null && count < k)
        {
            next = current.next;
            newHead = push(newHead, current);
            current = next;
            count++;
        }

        // if next group exists then making the desired
        // adjustments in the link
        if (next != null)
        {
            head.next = revListInGroupOfGivenSize(next, k);
            head.next.previous = head;
        }

        // pointer to the new head of the
        // reversed group
        return newHead;
    }

    // Function to print nodes in a
    // given doubly linked list
    static void printList(ListNode head)
    {
        while (head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        LinkedList24 DL = new LinkedList24();
        DL.insertList(10);
        DL.insertList(20);
        DL.insertList(30);
        DL.insertList(40);
        DL.insertList(50);
        DL.displayForward(head);
        revListInGroupOfGivenSize(head, 2);
        DL.displayForward(head);
    }
}
