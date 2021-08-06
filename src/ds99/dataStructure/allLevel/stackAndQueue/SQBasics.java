package ds99.dataStructure.allLevel.stackAndQueue;

import java.util.Stack;

public class SQBasics {
    public static void main(String[] args) {
        Stack<Integer> St = new Stack<>();
        St.add(1);                                            //from list interface
        St.push(2);                                      //use addElement() of Vector
        System.out.println("size "+ St.size());;                                        //from Vector use returnCount()
        System.out.println("isEmpty() "+ St.isEmpty());                     //from list interface, returns boolean
        System.out.println(St);
        System.out.println("empty() "+St.empty());                      //from vector class,returns boolean
        System.out.println(St);
        St.peek();                                           //use elementAt() of Vector
        St.pop();                                            //use removeElementAt() of Vector
        St.remove(0);                                  //from vector to remove ith element
        System.out.println(St);
    }
}
