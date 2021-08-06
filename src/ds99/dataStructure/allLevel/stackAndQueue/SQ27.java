package ds99.dataStructure.allLevel.stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SQ27 {
    public static Queue<Integer> revUsingIterative(Queue<Integer> q) {
        Stack<Integer> S = new Stack<>();
        while (!q.isEmpty()) {
            S.add(q.peek());
            q.remove();
        }
        while (!S.isEmpty()) {
            q.add(S.peek());
            S.pop();
        }
        return q;
    }

    public static Queue<Integer> revUsingRecursion(Queue<Integer> Q) {
        if (Q.isEmpty())
            return Q;

        int element = Q.poll();
        revUsingRecursion(Q);
        Q.add(element);
        return Q;
    }

    public static void main(String[] args) {
        Queue<Integer> Q = new LinkedList<>();
        Q.add(1);
        Q.add(2);
        Q.add(3);
        revUsingRecursion(Q);
        System.out.println(Q);

    }
}

/*Solution
Logic in recursion is that we will popped up elements from Queue until it reach out to be empty once this been
empty we will start inserting these elements. Till this time these elements will be stored in recursion stack.
* */
