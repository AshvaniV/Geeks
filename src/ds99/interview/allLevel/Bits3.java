//You are given two numbers A and B. The task is to count the number of bits needed to be flipped to convert A to B.
package ds99.interview.allLevel;

public class Bits3 {

    public static int countBitsFlip(int a, int b) {
        int XOR = a ^ b;
        int setBits = 0;
        for (int i = 0; i < 32; i++) {
            if ((XOR & (1 << i)) > 0) {
                setBits++;
            }
        }
        return setBits;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(countBitsFlip(a, b));
    }
}
