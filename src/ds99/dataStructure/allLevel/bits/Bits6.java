/*Given a number N having only one ‘1’ and all other ’0’s in its binary representation, find position of the only set bit.
If there are 0 or more than 1 set bit the answer should be -1. Position of  set bit '1' should be counted starting
with 1 from LSB side in binary representation of the number.
*/
package ds99.dataStructure.allLevel.bits;

public class Bits6 {
    static int findPosition(int n) {
        int position = 1;
        if ((n == 0) || ((n & (n - 1)) != 0))
            return -1;
        if (n == 1)
            return 1;
        else {
            for (int i = 0; i < 32; i++) {
                if ((n & (1 << i)) == 0) {
                    position++;
                } else
                    break;
            }
        }
        return position;
    }

    public static void main(String[] args) {
        System.out.println(findPosition(10));
    }
}
