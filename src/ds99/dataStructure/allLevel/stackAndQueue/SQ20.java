//Stack using two queues [We are making push operation expensive]

package ds99.dataStructure.allLevel.stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class SQ20 {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    //Function to push an element into stack using two queues.
    void push(int a) {
        q2.add(a);

        while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.remove();
        }
        while(!q2.isEmpty()) {
            q1.add(q2.peek());
            q2.remove();                                            //At last we are making q2 empty
        }
    }

    //Function to pop an element from stack using two queues.
    int pop() {
        if (q1.isEmpty()) {
            return -1;
        }

        int res = q1.peek();
        q1.remove();
        return res;
    }
}

//Here q1 will be treating as a Stack after implementing above methods