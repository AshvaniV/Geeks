// Remove duplicates from an unsorted linked list

package ds99.dataStructure.allLevel.linkeedList;

import java.util.HashSet;

public class LinkedList7 {
    static Node removeDuplicateUsingHashing(Node head) {

        HashSet<Integer> HS = new HashSet<>();
        HS.add(head.data);                                                  //add head's data
        //take a node which will be having address of head, do operation and link it with head
        Node node = head;
        while (node.next != null) {
            if (HS.contains(node.next.data)) {
                node.next = node.next.next;
            } else {
                HS.add(node.next.data);
                node = node.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedListUtils1 list = new LinkedListUtils1();
        list.insertIntoLL(10);
        list.insertIntoLL(20);
        list.insertIntoLL(10);
        list.insertIntoLL(40);
        System.out.println("input");
        list.display(list.head);
        Node newHead = removeDuplicateUsingHashing(list.head);
        System.out.println("\nnewHead");
        list.display(newHead);
        System.out.println("\nhead");
        list.display(list.head);
        System.out.println("\nHere list.head and newHead will print the same list as list header is also modified after removing duplicate");
    }
}
