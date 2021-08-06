package ds99.dataStructure.allLevel.stackAndQueue;

public class SQ1 {

    int[] stack;                         //size of array is 5 so there should be only 5 elements in Stack
    int top = -1;

    SQ1(int capacity) {
        stack = new int[capacity];
    }

    public void push(int data) {
        if (top == 4) {
            System.out.println("stack is already full");
        } else {
            stack[++top] = data;

        }
    }

    public int pop() {
        if (top < 0) {
            System.out.println("you don't have any element to pop");
            return -1;

        } else {
            return stack[top--];
        }
    }

    // peak of a stack
    public int peak() {
        if (top < 0) {
            System.out.println("We don't have any element in stack ");
            return -1;
        } else {
            return stack[top];
        }
    }

    // size of a stack
    public int size() {
        if (top < 0) {
            return 0;
        }
        return top + 1;
    }

    // isEmpty method for Stack
    public boolean isEmpty() {
        return (top < 0);
    }

    //to display elements of a Stack
    public void display() {
        for (int n : stack) {
            System.out.println(n + " ");
        }
    }

    public static void main(String[] args) {
        SQ1 Q1 = new SQ1(5);
        Q1.push(10);
        Q1.push(20);
        Q1.push(30);
        Q1.push(40);
        Q1.push(50);
        //Q1.push(60);
        //Q1.display();
        //System.out.println("0th index value "+Q1.stack[0]);
/*        System.out.println(Q1.pop());
        System.out.println(Q1.pop());
        System.out.println(Q1.pop());
        System.out.println(Q1.pop());
        System.out.println(Q1.pop());
        System.out.println(Q1.pop());*/
        System.out.println(Q1.size());
    }
}


/*      int i = 0;
        int j = 0;

        System.out.println(i++);  //first do operation [print] and then increment       0
        System.out.println(++j);  //fist increment and then do operation [operation]    1
        System.out.println(i);                                                          1
        System.out.println(j);                                                          1
        */