//reverse a linked list
package ds99.interview.allLevel;

public class LinkedList1 extends LinkedListUtils1 {

    private static Node reverse1(Node head) {                    /*Time Complexity: O(n)
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

    //as below is recursive solution we have to declare curr outside of loop
    Node curr;

    Node recursiveReverseUtil(Node head, Node prev) {
        curr = head;
//below condition will run only for last node to make that curr. For both the conditions we are creating a list in backward direction using head.next = prev
        if (curr.next == null) {
            curr.next = prev;
            return curr;
        }

//It will start from 1st node(curr) and make connection for rest in backward direction
        Node next = curr.next;
        curr.next = prev;
        recursiveReverseUtil(next, curr);

        return curr;
    }


    Node reverse2(Node head) {
        return recursiveReverseUtil(head, null);
    }

    public static void main(String[] args) {
        LinkedListUtils1 list = new LinkedListUtils1();
        list.insertIntoLL(10);
        list.insertIntoLL(20);
        list.insertIntoLL(20);
        list.insertIntoLL(30);
        System.out.println("input");
        list.display(list.head);
        list.head = new LinkedList1().reverse2(list.head);
        System.out.println("\n out");
        list.display(list.head);
    }
}


/*
iterative solution => reverse1()
This solution will have 3 variables, prev, current and next. as name suggested they will be holding respected positions
for the very first time, prev and next are null because previous to head was null and as we are reverting LL, head will
become last node of list after reversal so it's next value should be null. here next variable is helping to do that.
Next task is to reverse the links between nodes.
in loop we have to update all these variables along with links between nodes


In both the solution first iteration will have a link between 10 and null as next of 10 is null but a link between
10 and 20 will be 10.next = 20 till first iteration, it will change only in next iteration as 20.next = 10
*/