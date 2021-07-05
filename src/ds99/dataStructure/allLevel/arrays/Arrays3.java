//Find the "Kth" max and min element of an array
package ds99.dataStructure.allLevel.arrays;

import java.util.Arrays;

public class Arrays3 {

    private static void findKthMaxAndMin(int[] arr, int k) {
        Arrays.sort(arr);
        System.out.println("Kth min element is " + arr[k - 1] + " Kth max element is " + arr[arr.length - k]);
    }


    private static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,10000};
        printArray(arr);
        findKthMaxAndMin(arr,2);

    }
}

/*
 * Solution: Sort Array and then find max and min using index
 */