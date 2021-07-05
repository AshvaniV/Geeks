/*Triplet Sum in Array
Given an array arr of size n and an integer X. Find if there's a triplet in the array which sums up to the given integer X.
Expected Time Complexity: O(n2)
Expected Auxiliary Space: O(1)
**Two Pointer Algorithm**
*/

package ds99.dataStructure.allLevel.arrays;

import java.util.Arrays;

public class Arrays28 {


    public static int find3Numbers(int[] arr, int n, int sum) {
        Arrays.sort(arr);

        int result = 0;

        for (int i = 0; i < n - 2; i++) {
            int start = i + 1;
            int end = n - 1;


            while (start < end) {
                if ((arr[i] + arr[start] + arr[end]) == sum) {
                    result = 1;
                    break;
                } else if ((arr[i] + arr[start] + arr[end]) > sum) {
                    end--;
                } else {
                    start++;
                }
            }
            if (result == 1)
                break;
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = {305, 497, 163, 538, 552, 852, 733, 566, 939, 446, 229, 195, 527};
        int N = arr.length;
        int X = 1142;
        int output = find3Numbers(arr, N, X);
        System.out.println(output);
    }
}
/*Solution
we can't use extra space here so no hashing concept. We have to solve it using two pointer algorithm.

If we have array sorted then we can check by adding array values from start and end. We are having start next to our
ith element and end as last element of array so i should go till 3rd last element of array and by this time start
will be at 2nd last element and end will be at last element of array.

* */