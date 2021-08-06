//Longest consecutive subsequence
/*Given an array of positive integers. Find the length of the longest sub-sequence such that elements in the subsequence
are consecutive integers, the consecutive numbers can be in any order.
Input:
N = 7
a[] = {2,6,1,9,4,5,3}
Output:
6
Explanation:
The consecutive numbers here
are 1, 2, 3, 4, 5, 6. These 6
numbers form the longest consecutive
subsecuence.

*/
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
Here we took a HashMap and stored all Array's value as key and their value as 1 [considering inout array is unique].
Now traverse the array and check if map contains previous element of current element. If yes, that mean we would have
got consecutive sub-array previously so don't consider it.
If we don't have previous element in map that means we can have more elements consecutively from this element, so
consider this and find all consecutive elements from current element.
If result is having less value then max then replace replace with max and set max back to 0.

TC = O[N]
SC = O[N]
* */