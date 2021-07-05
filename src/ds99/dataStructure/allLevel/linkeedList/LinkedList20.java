//reverse DLL
package ds99.dataStructure.allLevel.linkeedList;

public class LinkedList20 extends DoublyLinkedListUtils1{

    public static ListNode reverseDLL(ListNode head)
    {
        if(head == null || head.next == null)
            return head;

        ListNode current = head;
        //reach current to last node
        while(current.next != null)
            current = current.next;

        //make last node as head
        head = current;
        current.next = current.previous;
        current.previous = null;
        current = current.next;

        //update link between all nodes from first and last
        while(current.previous != null) {
            ListNode temp = current.next;
            current.next = current.previous;
            current.previous = temp;
            current = current.next;
        }

        //Now we have only 1st node of old head [last node of current]
        current.previous = current.next;
        current.next = null;
        return head;

    }

}
