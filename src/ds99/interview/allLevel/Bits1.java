//find below in given integer:
/*
1. number of set bits
2. number of zeros
3. right most set bit
*/

package ds99.interview.allLevel;

public class Bits1 {

    static int numberOfSetBits(int n){
        int output = 0;
        int IntegerSize = Integer.SIZE;
        for(int i = 0; i < IntegerSize; i++){
            if((n & (1 << i)) != 0)
                output++;
        }
        return output;
    }

    static int numberOfUnsetSetBits(int n){
        int output = 0;
        int IntegerSize = Integer.SIZE;
        for(int i = 0; i < IntegerSize; i++){
            if((n & (1 << i)) == 0)
                output++;
        }
        return output;
    }

    static int rightmostSetBit(int n){
        int output = 0;
        int IntegerSize = Integer.SIZE;
        for(int i = 0; i < IntegerSize; i++){
            if((n & (1 << i)) == 0)
                output++;
            else
                break;
        }
        return output;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(rightmostSetBit(n));
    }
}

/*
Bits operations work much faster than integer operations as machine first convert decimal to binary and then operates on
integer operations.
 We have concept of left shift and right shift in bits so using that and shifting 1 to left side till integer size [32],
 so each time it will be multiplied with given number and if on that position bit is set for given number then it will
 return non zero result else will return 0.
*/
