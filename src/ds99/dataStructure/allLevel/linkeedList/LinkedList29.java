/*Given elements as nodes of the two linked lists. The task is to multiply these two linked lists, say L1 and L2.

Note: The output could be large take modulo 109+7.

*/

package ds99.dataStructure.allLevel.linkeedList;

public class LinkedList29 {
    public long multiplyTwoLists(Node first, Node second) {
        long N = 1000000007;
        long num1 = 0, num2 = 0;

        while (first != null || second != null) {

            if (first != null) {
                num1 = ((num1) * 10) % N + first.data;
                first = first.next;
            }

            if (second != null) {
                num2 = ((num2) * 10) % N + second.data;
                second = second.next;
            }

        }
        return ((num1 % N) * (num2 % N)) % N;
    }
}
