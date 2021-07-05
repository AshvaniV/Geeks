//Given a linked list of 0s, 1s and 2s, sort it.

package ds99.dataStructure.allLevel.linkeedList;

public class LinkedList27 extends LinkedListUtils1 {
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        int[] a = {0, 0, 0};
        Node temp = head;
        int i = 0;
        while (temp != null) {
            a[temp.data]++;
            temp = temp.next;
        }


        temp = head;
        while (temp != null) {
            if (a[i] == 0)
                i++;

            else {
                temp.data = i;
                a[i]--;
                temp = temp.next;
            }
        }
        return head;
    }
}
