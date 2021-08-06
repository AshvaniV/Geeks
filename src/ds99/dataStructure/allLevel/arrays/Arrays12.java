//  **Hard/Medium** V.IMP
/*Merge 2 sorted arrays without using Extra space
/*Given two sorted arrays arr1[] of size N and arr2[] of size M. Each array is sorted in non-decreasing order.
Merge the two arrays into one sorted array in non-decreasing order without using any extra space.
Input:
N = 4, M = 5
arr1[] = {1, 3, 5, 7}
arr2[] = {0, 2, 6, 8, 9}
Output: 0 1 2 3 5 6 7 8 9
Explanation: Since you can't use any
extra space, modify the given arrays
to form
arr1[] = {0, 1, 2, 3}
arr2[] = {5, 6, 7, 8, 9}*/


package ds99.dataStructure.allLevel.arrays;

import java.util.Arrays;

public class Arrays12 {

    static void mergeWithoutExtraSpace(int[] arr1, int[] arr2) {
        //start from last index on arr1 and first index for arr2
        int lastIndexOfArr1 = arr1.length - 1;
        int firstIndexOfArr2 = 0;

        while (lastIndexOfArr1 >= 0 && firstIndexOfArr2 < arr2.length) {
            if (arr1[lastIndexOfArr1] > arr2[firstIndexOfArr2]) {
                int temp = arr1[lastIndexOfArr1];
                arr1[lastIndexOfArr1] = arr2[firstIndexOfArr2];
                arr2[firstIndexOfArr2] = temp;
                lastIndexOfArr1--;
                firstIndexOfArr2++;
            } else

                /*This is the condition when arr1[lastIndexOfArr1] > arr2[firstIndexOfArr2], that means after this
                 * situation, Arr1's all left to current elements would be smaller then right elements of arr2 so we are
                 * breaking this loop here.
                 * */
                break;

        }

        //Now arr1 has all element lower than any element of arr2 so now sort them individually and print them
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int t : arr1) {
            System.out.print(t + " ");
        }
        System.out.println("*");
        for (int t : arr2) {
            System.out.print(t + " ");
        }
        System.out.println("*");

        StringBuilder sb = new StringBuilder();
        for (int value : arr1) {
            sb.append(value).append(" ");
        }

        for (int value : arr2) {
            sb.append(value).append(" ");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 7};
        int[] arr2 = {1, 4, 6, 6, 7, 7, 10, 11, 12, 14, 15, 16};
        mergeWithoutExtraSpace(arr1, arr2);

    }
}
/*
This solution is not exactly without using any extra space because we are using here temp variable
Approach is simple, we know that both arrays are sorted in their own way, so our solution is make all elements of Array1
smaller than Array2. Initially we don't care about how they are storing in both these arrays, we are taking care that
at last while sorting these arrays individually and printing both these arrays.

Collecting these arrays in a StringBuilder and  print SB is additional part and was not part of requirement.
*/