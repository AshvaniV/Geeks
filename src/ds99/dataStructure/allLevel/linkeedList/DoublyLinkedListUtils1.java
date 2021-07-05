package ds99.dataStructure.allLevel.linkeedList;

public class DoublyLinkedListUtils1 {
     static ListNode head;
     static ListNode tail;
     int length;

    //constructor for doubly linked list
    public DoublyLinkedListUtils1() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    //method to insert elements into a Linked List(same will be insert a node at last)
    public void insertList(int data) {

        ListNode newNode = new ListNode(data);
        newNode.data = data;
        newNode.next = null;
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        newNode.previous = tail;    //creating backward linked list connection.If we will skip this backward list will not display correctly.
        tail = newNode;             //creating forward linked list relation
        length++;
    }

    // insert at given location
    void addNode(ListNode head, int pos, int data) {
//create a new node and put data in it
        ListNode node = new ListNode(data);
//create a temporary node and put head in it
        ListNode temp = head;
//traverse head until we found the given location for data insertion
        for (int i = 0; i < pos; i++) {
            temp = temp.next;
        }
//now temp reached to the location where we need to insert the value
//we have to put data(which we have saved in node)
        node.next = temp.next;
        node.previous = temp;
        temp.next = node;

    }


    //Method to insert a node at beginning
    public void insertAtStart(int data) {

        ListNode newNode = new ListNode(data);
        newNode.data = data;
        newNode.next = null;
        if (head == null) {
            head = newNode;
            head.previous = tail;
            tail = newNode;
        } else {
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
        }
    }


    //forward Display Method
    public void displayForward(ListNode head) {
        if (head == null) {
            return;
        }

        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    //backward display method
    public void displayBackward(ListNode tail) {
        if (tail == null) {
            return;
        }
        ListNode current = tail;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.previous;
        }
        System.out.println("null");
    }


    // This class is to define the variables in a Node
     static class ListNode {
         int data;
         ListNode previous;
         ListNode next;

        // constructor to insert values in a linked list
        public ListNode(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {


        DoublyLinkedListUtils1 DL1 = new DoublyLinkedListUtils1();
        DL1.insertList(10);
        DL1.insertList(20);
        DL1.insertList(30);
        DL1.insertList(40);
        DL1.displayForward(head);
//		 DL1.displayBackward(tail);
        System.out.println("the length of linked list is " + DL1.length);
//		 DL1.insertAtStart(01);
//		 DL1.displayForward(head);
//		 DL1.displayBackward(tail);
    }
}


