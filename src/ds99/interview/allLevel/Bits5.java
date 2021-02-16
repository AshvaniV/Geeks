//Given a positive integer N. The task is to check if N is a power of 2. More formally, check if N can be expressed as 2x for some x.

package ds99.interview.allLevel;

public class Bits5 {

    public static boolean isPowerOfTwo(long n) {
        if (n == 0)
            return false;
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
    }
}
