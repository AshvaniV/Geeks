package ds99.dataStructure.allLevel.linkeedList;

public class LinkedList26 {
    Node head;  // head of list

    /* Linked list Node*/
    class Node {
        int data;
        Node next, bottom;

        Node(int data) {
            this.data = data;
            next = null;
            bottom = null;
        }
    }

    Node push(Node head_ref, int data) {
        Node new_node = new Node(data);
        new_node.bottom = head_ref;
        head_ref = new_node;
        return head_ref;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.bottom;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        LinkedList26 L = new LinkedList26();

        /* Let us create the following linked list
            5 -> 10 -> 19 -> 28
            |    |     |     |
            V    V     V     V
            7    20    22    35
            |          |     |
            V          V     V
            8          50    40
            |                |
            V                V
            30               45
        */

        L.head = L.push(L.head, 30);
        L.head = L.push(L.head, 8);
        L.head = L.push(L.head, 7);
        L.head = L.push(L.head, 5);

        L.head.next = L.push(L.head.next, 20);
        L.head.next = L.push(L.head.next, 10);

        L.head.next.next = L.push(L.head.next.next, 50);
        L.head.next.next = L.push(L.head.next.next, 22);
        L.head.next.next = L.push(L.head.next.next, 19);

        L.head.next.next.next = L.push(L.head.next.next.next, 45);
        L.head.next.next.next = L.push(L.head.next.next.next, 40);
        L.head.next.next.next = L.push(L.head.next.next.next, 35);
        L.head.next.next.next = L.push(L.head.next.next.next, 20);

        // flatten the list
        L.head = L.flatten(L.head);

        L.printList();
    }


    //solution
    Node flatten(Node root) {
        //we are doing it using head recursion so it will first go to last pointer which have bottom elements
        //and then come towards left side

        if (root == null || root.next == null)
            return root;

        return merge(root, flatten(root.next));
    }

    Node merge(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;

        Node result;

        if (a.data < b.data) {
            result = a;
            //we found an element in a so we have to look for next element in a towards bottom side
            result.bottom = merge(a.bottom, b);
        } else {
            result = b;
            result.bottom = merge(a, b.bottom);
        }
        result.next = null;
        return result;
    }

}
