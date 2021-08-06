//Reverse First K elements of Queue
package ds99.dataStructure.allLevel.stackAndQueue;
import java.util.Queue;
import java.util.Stack;

public class SQ28 {
    //Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Stack<Integer> St1 = new Stack<>();

        int restElements = q.size() - k;
        while (k > 0 && !q.isEmpty()) {
            int k1 = q.peek();
            q.remove();
            St1.push(k1);
            k--;
        }

        while (!St1.isEmpty()) {
            q.add(St1.pop());
        }

        while (restElements > 0 && !q.isEmpty()) {
            int temp = q.peek();
            q.remove();
            q.add(temp);
            restElements--;
        }
        return q;

    }
}
