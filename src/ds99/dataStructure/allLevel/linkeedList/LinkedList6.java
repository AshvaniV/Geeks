//Remove Duplicates in a sorted Linked List
package ds99.dataStructure.allLevel.linkeedList;

public class LinkedList6 extends LinkedListUtils1 {

    private static Node removeDuplicate(Node head) {
        Node current = head;
        {
            {
                while (current != null) {
                    Node temp = current;
                    while (temp != null && temp.data == current.data) {
                        temp = temp.next;
                    }
                    current.next = temp;
                    current = current.next;
                }
            }
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedListUtils1 list = new LinkedListUtils1();
        list.insertIntoLL(10);
        list.insertIntoLL(20);
        list.insertIntoLL(20);
        list.insertIntoLL(30);
        System.out.println("input");
        list.display(list.head);
        Node newHead = removeDuplicate(list.head);
        System.out.println("\nnewHead");
        list.display( newHead);
        System.out.println("\nhead");
        list.display(list.head);
        System.out.println("\nHere list.head and newHead will print the same list as list header is also modified after removing duplicate");
    }
}

/*
In LL, the most important thing is link between two nodes. If we have control over these links, we can solve qn easily.
Like in this example 10 is head node and we are passing it to remove duplicate method, so our method has a reference
of list's head.

logic:

*/
