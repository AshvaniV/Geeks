//detect a loop in LL
package ds99.dataStructure.allLevel.linkeedList;

public class LinkedList3 {
    public static boolean detectLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }
        public static void main(String[] args) {

        }
    }

