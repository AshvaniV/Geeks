package ds99.interview.allLevel;

public class LinkedListUtils1 {
    Node head;

    //insert
    void insertIntoLL(int data)                                            //this function will insert a node at last each time
    {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }

            n.next = newNode;
        }
    }

    //display
    public void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;

        }
    }

    //count
    public int getCount(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}

class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
        this.next = null;

    }
}
