//Move last element to front of a given Linked List

package ds99.dataStructure.allLevel.linkeedList;

public class LinkedList8 extends LinkedListUtils1 {

    private static Node moveLastElementToFront(Node head) {
        Node last = head;
        Node secondLast = null;

        //place last and secondLast to their actual position
        while (last.next != null) {
            secondLast = last;
            last = last.next;
        }

        secondLast.next = null;
        last.next = head;
        head = last;
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
        list.head = moveLastElementToFront(list.head);
        System.out.println("\n out");
        list.display(list.head);
    }
}
