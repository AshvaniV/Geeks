/*Given an array of size n and a number k, find all elements that appear more than n/k times*/
/*input arrays is {3, 1, 1, 2, 1, 2, 3, 3} and k is 4, then the output should be [1, 3].
Note that size of array is 8 (or n = 8), so we need to find all elements that appear more than 2 (or 8/4) times.*/
package ds99.dataStructure.allLevel.arrays;

import java.util.HashMap;
import java.util.Map;

public class Arrays25 {
    public static void moreThanNdK(int[] a, int n, int k) {
        int x = n / k;
        HashMap<Integer, Integer> y = new HashMap<>();

        // count the frequency of each element.
        for (int i = 0; i < n; i++) {
            if (!y.containsKey(a[i]))
                y.put(a[i], 1);
            else {
                int count = y.get(a[i]);
                y.put(a[i], count + 1);
            }
        }

        // iterate over each element in the hash table
        // and check their frequency, if it is more than
        // n/k, print it.
        for (Map.Entry m : y.entrySet()) {
            Integer temp = (Integer) m.getValue();
            if (temp > x)
                System.out.println(m.getKey());
        }
    }

    // Driver Code
    public static void main(String[] args) {
        int[] a = new int[]{1, 1, 2, 2, 3, 5, 4, 2, 2, 3, 1, 1, 1};
        int n = 12;
        int k = 4;
        moreThanNdK(a, n, k);
    }
}

/*
Solution:
as we know array question related to count can be easily solved using Hashing technique so here we are storing occurrence
of all elements in a hashmap and then checking whether this occurrence is more than n/k time or not.

* */