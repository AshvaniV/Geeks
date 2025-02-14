//Count pairs with given sum
/*
Input:
N = 4, K = 6
arr[] = {1, 5, 7, 1}
Output: 2
Explanation:
arr[0] + arr[1] = 1 + 5 = 6
and arr[1] + arr[3] = 5 + 1 = 6.
* */
package ds99.dataStructure.allLevel.arrays;

import java.util.HashMap;

public class Arrays18 {

    static int pair(int[] arr, int sum) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int value : arr) {

            //increase count
            if (map.containsKey(sum - value)) {
                count += map.get(sum - value);
            }

     //add to map [whether current number was involved to increase count or not.. In each case it ll be added to map]
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 1};
        int sum = 6;
        System.out.println(pair(arr, sum));

    }
}


/*Whenever we have problems relates to count pairs, sub arrays, count distinct elements then hashing is the best approach

There are 3 conditions which will be satisfied.
ith element not present in map. ith element present in map. k-ith element is present in map.

We are counting in first condition and then adding to map.

*  */