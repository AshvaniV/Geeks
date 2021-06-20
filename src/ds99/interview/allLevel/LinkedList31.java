//Segregate even and odd nodes in a Link List
/*This question may be asked in 2 ways, one to check data is even or odd and other to check index is even or odd.
below solution is when we are checking for data is even or odd. If we want to check for index, we have defined index
below as well.*/

package ds99.interview.allLevel;

public class LinkedList31 extends LinkedListUtils1 {
    static Node divide(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node oddDummy = new Node(-1);
        Node evenDummy = new Node(-1);

        Node oddTail = oddDummy;
        Node evenTail = evenDummy;

        int index = 0;
        Node curr = head;
        while (curr != null) {
            if (curr.data % 2 == 0) {
                evenTail.next = curr;
                evenTail = curr;
            } else {
                oddTail.next = curr;
                oddTail = curr;
            }

            curr = curr.next;
            index++;
        }

        evenTail.next = oddDummy.next;
        oddTail.next = null;

        return evenDummy.next;
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
        Node out = divide(list1.head);
        new LinkedList31().display(list1.head);

    }
}
/*
Solution
In this approach, we are assigning whole list to both evenTail and oddTail list with a dummy head.
now we are neglecting even from oddList and odd from evenList.
At last we are joining odd list after even list and then returning head of even list*/
