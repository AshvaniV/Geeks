/* Kadane's Algorithm
This algorithm is used to find a sub array which sum is maximum in whole array. For example
{1, 2, 3, -2, 5} = Here sub array is complete array which sum is maximum here.
*/

package ds99.dataStructure.allLevel.arrays;

public class Arrays13 {
    static int maxSubArraySum(int[] arr, int n) {

        int max = Integer.MIN_VALUE;
        int maxEnd = 0;

        for (int i = 0; i < n; i++) {
            maxEnd = maxEnd + arr[i];
            if (max < maxEnd)
                max = maxEnd;

            if (maxEnd < 0)
                maxEnd = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, -500, -2, 500};
        System.out.println(maxSubArraySum(arr, arr.length));
    }
}

/*
 * Logic: We maintain 2 variables here that are max and maxEnd. MaxEnd is to maintain the sum of array elements at any
 * point of time and max is to save maximum value from maxEnd so whenever we have maxEnd > max then update max with
 * maxEnd. If any point maxEnd is negative then set it back to 0.
 * */
