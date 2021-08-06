//Queue using two Stacks
package ds99.dataStructure.allLevel.stackAndQueue;

import java.util.Stack;

public class SQ23 {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void insert(int x) {
        //push all elements from s1 to s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        //Once s1 empty push element to s1
        s1.push(x);

        //push everything back to s1
        while (!s2.isEmpty()) {
            s1.push(s2.pop());                                              //At last we are making s2 empty
        }
    }


    int remove() {
        if (s1.isEmpty())
            return -1;
        else {
            return s1.pop();
        }
    }
}

//Here after implementing above methods s1 will be treated as Queue
