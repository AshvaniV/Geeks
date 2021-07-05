//Reverse a Linked List in group of Given Size
package ds99.dataStructure.allLevel.linkeedList;

public class LinkedList2 extends LinkedListUtils1 {

    static Node reverseInGroup(Node head, int grpSize) {
        int count = 0;
        Node current = head;
        Node previousOne = null;
        Node nextOne = null;
        while (count < grpSize && current != null) {
            //iterative solution for reverse a LL
            nextOne = current.next;
            current.next = previousOne;
            previousOne = current;
            current = nextOne;
            count++;
        }
        if (current != null)
            head.next = reverseInGroup(current, grpSize);

        return previousOne;
    }

    public static void main(String[] args) {
        LinkedList2 LL = new LinkedList2();
        LL.insertIntoLL(10);
        LL.insertIntoLL(20);
        LL.insertIntoLL(30);
        LL.insertIntoLL(40);
        LL.insertIntoLL(50);
        LL.insertIntoLL(60);
        LL.insertIntoLL(70);
        LL.display(LL.head);
        LL.head = reverseInGroup(LL.head, 2);
        System.out.println("\nout\n");
        LL.display(LL.head);

    }
}


/*
Here we created current from head, so initially they will be referring to same node.
By the time we have completed 1 group reversal, [in above example 20 -> 10] we have stored linked in current
but head will detached from this at it was always on 10 so now by this time 10.next would be null.
we have to make this reference again that's why we are assigning new recursive function call to head.next
*/