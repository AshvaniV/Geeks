//Subarray with 0 sum

package ds99.interview.allLevel;

import java.util.*;

public class Arrays21 {

    static boolean subArraySum(int[] a) {
        int n = a.length;
        Set<Integer> hs = new HashSet<Integer>();
        int sum = 0;
        for (int value : a) {
            sum += value;
            if (value == 0 || sum == 0 || hs.contains(sum)) {
                return true;
            }
            hs.add(sum);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {-4, 1, 2, -3, 4, 5};
        System.out.println(subArraySum(arr));
    }
}

/*
Solution: there would 3 scenarios which will come for this logic
1. we have 0 in array.
2. we have sub array sum as 0.
3. We are adding value to sum each time and then adding sum to Set, so if any time sum was found as presented
in Set, this means there is subarray which summation is 0 that's why we have got the same sum again as presented in Set.
* */
