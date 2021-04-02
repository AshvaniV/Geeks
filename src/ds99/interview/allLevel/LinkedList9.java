package ds99.interview.allLevel;

public class LinkedList9 extends LinkedListUtils1 {

    /* Function to create a new node with given data */
    static Node newNode(int data)
    {
        Node new_node = new Node(data);
        new_node.data = data;
        new_node.next = null;
        return new_node;
    }
    /* Function to reverse the linked list */
    static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    /* Adds one to a linked lists and return the head
    node of resultant list */
    static Node addOneUtil(Node head) {
        // res is head node of the resultant list
        Node res = head;
        Node temp = null, prev = null;

        int carry = 1, sum;

        while (head != null) // while both lists exist
        {
            // Calculate value of next digit in resultant
            // list. The next digit is sum of following
            // things (i) Carry (ii) Next digit of head list
            // (if there is a next digit)
            sum = carry + head.data;

            // update carry for next calulation
            carry = (sum >= 10) ? 1 : 0;

            // update sum if it is greater than 10
            sum = sum % 10;

            // Create a new node with sum as data
            head.data = sum;

            // Move head and second pointers to next nodes
            temp = head;
            head = head.next;
        }

        // if some carry is still there, add a new node to
        // result list.
        if (carry > 0)
            temp.next = newNode(carry);

        // return head of the resultant list
        return res;
    }

    // This function mainly uses addOneUtil().
    static Node addOne(Node head) {
        // Reverse linked list
        head = reverse(head);

        // Add one from left to right of reversed
        // list
        head = addOneUtil(head);

        // Reverse the modified list
        return reverse(head);
    }

    public static void main(String[] args) {
        LinkedListUtils1 list = new LinkedListUtils1();
        list.insertIntoLL(10);
        list.insertIntoLL(20);
        list.insertIntoLL(20);
        list.insertIntoLL(30);
        System.out.println("input");
        list.display(list.head);
        list.head = addOne(list.head);
        System.out.println("\n out");
        list.display(list.head);
    }

}
