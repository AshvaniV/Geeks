//Smallest Positive missing number
/*You are given an unsorted array with both positive and negative elements. You have to find the smallest positive number missing from the array*/
package ds01.arrays.level1;

import java.util.HashSet;

public class Arrays_11 {
    static int findMissing(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        int missing = 1;

        if (arr.length == 1)
            return 1;

        for (int a : arr) {
            hs.add(a);
        }
        for (int i = 0; i < arr.length; i++) {
            if (!hs.contains(missing))
                return missing;

            else
                missing++;
        }
        return arr.length + 1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -7, 6, 8, 1, -10, 15};
        int size = 10;
        System.out.println(findMissing(arr));
    }
}
