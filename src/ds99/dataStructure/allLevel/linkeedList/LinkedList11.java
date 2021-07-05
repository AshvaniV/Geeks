package ds99.dataStructure.allLevel.linkeedList;

public class LinkedList11 extends LinkedListUtils1 {

    public static Node findIntersection(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        Node temp = null;
        Node ans = null;
        if (temp1 == null || temp2 == null) {
            return null;
        }
        while (temp1 != null && temp2 != null) {
            if (temp1.data > temp2.data) {
                temp2 = temp2.next;
            } else if (temp1.data < temp2.data) {
                temp1 = temp1.next;

                //when temp1.data is equal to temp2.data
            } else {
                if (temp == null) {   //run only first time to collect first common element
                    temp = temp1;
                    ans = temp;
                } else {                //rest of the time just link temp with next common element and increase it
                    temp.next = temp1;
                    temp = temp.next;
                }

                //increase temp1 and temp2
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LinkedListUtils1 list1 = new LinkedListUtils1();
        list1.insertIntoLL(1);
        list1.insertIntoLL(2);
        list1.insertIntoLL(3);
        list1.insertIntoLL(4);
        list1.insertIntoLL(6);
        LinkedListUtils1 list2 = new LinkedListUtils1();
        list2.insertIntoLL(2);
        list2.insertIntoLL(4);
        list2.insertIntoLL(6);
        list2.insertIntoLL(8);

        Node out = findIntersection(list1.head, list2.head);
        new LinkedList11().display(out);


    }
}
