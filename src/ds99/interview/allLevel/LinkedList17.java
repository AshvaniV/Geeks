package ds99.interview.allLevel;

public class LinkedList17 {
    void splitList(circular_LinkedList list) {
        // Your code here
        Node head = list.head;
        Node slow = list.head;
        Node fast = list.head;
        if (slow == null) {
            return;
        }
        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

     //we have mid of list so we can create 2 list reference from this and make them circular.

        //if there was any node left while counting middle then add it to fast. So by this time fast ll be at last and
        //middle will be on middle node.
        if (fast.next != head) {
            fast = fast.next;
        }
        list.head1 = head;                    //for fist list
        list.head2 = mid.next;                //for second list
        mid.next = head;                      //to make fist list circular
        fast.next = list.head2;               //to make second list circular
    }


    //Driver code
    class circular_LinkedList {
        Node head, head1, head2;  // head of lisl
        //Node last = null;
        Node last = null;

        /* Linked list Node*/


        /* Utility functions */

        /* Inserts a new Node at front of the list. */
        public void addToTheLast(Node node) {

            if (head == null) {
                head = node;

            } else {
                Node temp = head;
                while (temp.next != null)
                    temp = temp.next;

                temp.next = node;
            }
        }

        /* Function to print linked list */
        void printList(Node node) {
            Node temp = node;
            if (node != null) {
                do {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                } while (temp != node);
            }
            System.out.println();
        }

        void circular() {
            last = head;
            while (last.next != null)
                last = last.next;
            last.next = head;
            //System.out.println(last);
        }

    }// } Driver Code Ends
}
