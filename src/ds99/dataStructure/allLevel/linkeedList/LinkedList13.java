//merge sort


package ds99.dataStructure.allLevel.linkeedList;

public class LinkedList13 extends LinkedListUtils1 {
    static Node mergeSort(Node head) {
        Node current = head;
        if (head == null || head.next == null)
            return head;

        Node middle = middleNode(head);
        Node middleNext = middle.next;

        middle.next = null;

        Node left = mergeSort(current);
        Node right = mergeSort(middleNext);
        Node answer = merge(left, right);
        return answer;
    }

    static Node middleNode(Node current) {
        Node slow = current;
        Node fast = current.next;

        while (fast != null) {
            fast = fast.next;

            if (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
        }
        return slow;
    }


    static Node merge(Node left, Node right) {
        Node result = null;
        if (left == null)
            return right;

        if (right == null)
            return left;

        if (left.data < right.data) {
            result = left;
            result.next = merge(left.next, right);
        } else {
            result = right;
            result.next = merge(left, right.next);
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedListUtils1 list1 = new LinkedListUtils1();
        list1.insertIntoLL(1);
        list1.insertIntoLL(5);
        list1.insertIntoLL(2);
        list1.insertIntoLL(40);
        list1.insertIntoLL(6);
        mergeSort(list1.head);
        new LinkedList13().display(list1.head);

    }
}


/*
* Find the middle element and then divide list into 2 parts. While dividing into 2 parts so head for first list will be
* earlier existing head for main LL, means we are not changing head here and also last node should be linked to null.
*  on other hand for 2nd LL we need a starting point which is from middle.next till last.
* each time we are diving LL into small parts until it reach till last element and then merge them from bottom to up
* recursively.
*
*
* */