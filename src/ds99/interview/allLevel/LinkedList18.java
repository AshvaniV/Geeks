//palindrome
package ds99.interview.allLevel;

import java.util.Stack;

public class LinkedList18 {
    boolean isPalindrome(Node head) {
        //create a Stack of list data
        Stack<Integer> S = new Stack<>();
        Node test = head;
        while (test != null) {
            S.push(test.data);
            test = test.next;
        }
        boolean flag = true;
        while (head != null) {
            int i = S.pop();
            if (i == head.data) {
                head = head.next;
            } else {
                flag = false;
                break;
            }

        }
        return flag;
    }
}
