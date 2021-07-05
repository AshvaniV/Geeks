/*Kadane's Algorithm
Given an array arr of N integers. Find the contiguous sub-array with maximum sum.
arr[] = {1,2,3,-2,5}
Output: 9

arr[] = {-1,-2,-3,-4}
Output: -1
*/

package ds99.dataStructure.allLevel.arrays;

public class Arrays8 {

    private static int subArraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int maxEnd = 0;
        for (int i : arr) {
            maxEnd = maxEnd + i;

            if (maxSum < maxEnd)
                maxSum = maxEnd;

            if (maxEnd < 0)
                maxEnd = 0;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(subArraySum(arr));
    }
}

/*logic:

We have 2 variables maxEnd and maxSum. maxSum is sub-array's sum at any point of time.
We will be calculating maxSum until maxEnd is bigger than maxSum. If anytime we get maxEnd negative, set it back to 0.

first variable maxEnd is continuously adding elements until their sum is positive.
Second variable maxSum is changing it's value whenever we found maxEnd is greater than it.
 */