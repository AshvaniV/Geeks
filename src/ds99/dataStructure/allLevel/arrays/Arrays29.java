//Trapping rain water
/*Given an array arr[] of N non-negative integers representing the height of blocks. If width of each block is 1,
compute how much water can be trapped between the blocks during the rainy season.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
*/

package ds99.dataStructure.allLevel.arrays;

public class Arrays29 {

    static void trappingWater2(int[] arr, int n) {
//create 2 arrays L and R, where L will have maximum height from left side and R will have maximum height from right
        int[] L = new int[arr.length];
        int[] R = new int[arr.length];
        int maxFromLeft = 0;
        int maxFromRight = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxFromLeft) {
                maxFromLeft = arr[i];
            }
            L[i] = maxFromLeft;
        }

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
            }
            R[i] = maxFromRight;
        }
        printArray(L);
        printArray(R);

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + (Math.min(L[i], R[i]) - arr[i]);
        }
        System.out.println("sum " + sum);
    }

    private static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2};
        trappingWater2(arr, arr.length);
    }
}

/*Solution:
The more height of wall we have the less water we can trap at each level.
we are maintaining 2 arrays L and R which will have max from left to right and max from right to left.
so at any level we can know what is it's left max height and what is it's right max height. so if we take take minimum of
both L and R and subtract ith value from it, we will have the max water which we can stored at any level.
* */
