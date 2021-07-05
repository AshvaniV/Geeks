//Three way partitioning of an array around a given value
/*Given an array of size N and a range [a, b]. The task is to partition the array around the range such that array is divided into three parts.
1) All elements smaller than a come first.
2) All elements in range a to b come next.
3) All elements greater than b appear in the end.
The individual elements of three sets can appear in any order. You are required to return the modified array.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)
*/

package ds99.dataStructure.allLevel.arrays;

public class Arrays32 {

    public static void threeWayPartition(int[] arr, int a, int b) {
        int l = 0;
        int r = arr.length - 1;

        for (int i = 0; i <= r; i++) {
            if (arr[i] < a) {
                int tmp = arr[i];
                arr[i] = arr[l];
                arr[l] = tmp;
                l++;
            } else if (arr[i] > b) {
                int tmp = arr[i];
                arr[i] = arr[r];
                arr[r] = tmp;
                r--;
                i--;
            }
        }
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] arr = {15, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
        int a = 14;
        int b = 20;
        threeWayPartition(arr, a, b);
    }

}

/*Solution
We can't use extra space here with O[N] and also cam't traverse it using inner loop so we have to solve it using temp
variable.
We have defined 2 variables l and r which will maintain lower to a and higher to b values and will help in swapping
so whenever we find any value smaller than a we swap ith value with lth value and increase l. As we started l with 0
index it will always maintain values which are having value lower than a. other side whenever we are having a value
greater than b then we are swapping it with rth value[which was initially on last element of array].
now in this case the value came to ith location might again lower or smaller than a and b so we have to consider it again
and to consider it again we are decreasing i by 1.
* */
