package ds99.interview.allLevel;

public class LinkedList30 extends LinkedListUtils1 {
    private static Node reverse(Node head) {                    /*Time Complexity: O(n)
                                                                   Space Complexity: O(1)*/
        Node current = head;
        Node previousOne = null;
        Node nextOne = null;
        while (current != null) {
            nextOne = current.next;
            current.next = previousOne;
            previousOne = current;
            current = nextOne;
        }
        head = previousOne;
        return head;
    }

    static Node compute(Node head) {
        head = reverse(head);                      //head of reversed list
        int maxTillNow = head.data;
        Node previousOne = head;
        Node nextOne = head.next;
        while (nextOne != null) {

            if (nextOne.data >= maxTillNow) {
                maxTillNow = nextOne.data;
                previousOne = previousOne.next;
                nextOne = nextOne.next;
            } else {
                previousOne.next = nextOne.next;
                nextOne = previousOne.next;
            }
        }
        head = reverse(head);
        return head;
    }


    public static void main(String[] args) {
        LinkedListUtils1 list1 = new LinkedListUtils1();
        list1.insertIntoLL(12);
        list1.insertIntoLL(15);
        list1.insertIntoLL(10);
        list1.insertIntoLL(11);
        list1.insertIntoLL(5);
        list1.insertIntoLL(6);
        list1.insertIntoLL(2);
        list1.insertIntoLL(3);


        LinkedList30 l = new LinkedList30();
        l.display(list1.head);
        System.out.println("out");
        Node out = compute(list1.head);
        l.display(out);


    }
}
