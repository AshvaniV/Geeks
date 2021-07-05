//Longest consecutive subsequence

package ds99.dataStructure.allLevel.arrays;

import java.util.HashMap;

public class Arrays24 {
    static int findLongestConseqSubseq(int[] arr, int N) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int value : arr) {
            map.put(value, 1);
        }
        int max = 0;
        int result = 0;
        int current = 0;

        for (int value : arr) {
            if (!map.containsKey(value - 1)) {
                current = value;
                while (map.containsKey(current)) {
                    current++;
                    max++;
                }
                if (result < max) {
                    result = max;
                }
                max = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 7, 16};
        System.out.println(findLongestConseqSubseq(arr, arr.length));
    }
}
/*Logic:
Here we took 1 HashMap and stored al Array's value as key and their value as 1.
Now traverse the array and check if map contains previous element of current element. If yes, that mean we can find
consecutive sub-array later as well so don't consider it.
If we don't have previous element in map that means we can have more elements consecutively from this element, so
consider this.

TC = O[N]
SC = O[N]
* */