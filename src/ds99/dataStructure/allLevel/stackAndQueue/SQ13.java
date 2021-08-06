//insert at last in a Stack [This is using in reversing a Stack]
package ds99.dataStructure.allLevel.stackAndQueue;

import java.util.Stack;

public class SQ13 {

    static void reverse() {
        if(st.size() > 0) {
            char c = st.pop();
            reverse();

            // Insert all the items held
            // in Function Call Stack
            // one by one from the bottom
            // to top. Every item is
            // inserted at the bottom
            insert_at_bottom(c);
        }

    }

    static Stack<Character> st = new Stack<>();

    static void fillStack(Stack<Character> s) {
        s.push('1');
        s.push('2');
        s.push('3');
    }

    static void insert_at_bottom(char x) {

        if (st.isEmpty())
            st.push(x);

        else {
        /* All items are held in Function Call Stack until we
           reach end of the stack. When the stack becomes
           empty, the st.size() becomes 0, the
           above if part is executed and the item is inserted
           at the bottom */

            char a = st.peek();
            st.pop();
            insert_at_bottom(x);

            //push all the items held in Function Call Stack
            //once the item is inserted at the bottom
            st.push(a);
        }
    }

    public static void main(String[] args) {

        fillStack(st);
        System.out.println(st);
        insert_at_bottom('0');
        System.out.println(st);
        reverse();
        System.out.println(st);
    }
}
