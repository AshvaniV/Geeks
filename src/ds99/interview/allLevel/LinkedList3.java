//detect a loop in LL
package ds99.interview.allLevel;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

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

