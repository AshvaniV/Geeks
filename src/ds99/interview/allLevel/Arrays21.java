//Subarray with 0 sum

package ds99.interview.allLevel;

import java.util.*;

public class Arrays21 {
    //there would 3 scenario which will come in for this logic
    /* 1. we have 0 in array.
       2. we have sub array sum as 0.
       3. while adding prefix elements, the element which were already present in array coming again
    */

    static boolean subArraySum(int[] a) {
        int n = a.length;
        Set<Integer> hs = new HashSet<Integer>();
        int sum = 0, c = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (a[i] == 0 || sum == 0 || hs.contains(sum)) {
                return true;
            }
            hs.add(sum);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, -3, 4, 5};
        System.out.println(subArraySum(arr));


    }
}
