/*  Union of two arrays :
Given two arrays A and B of size N and M respectively. The task is to find union and intersection between these two arrays.
Union of the two arrays can be defined as the set containing distinct elements from both the arrays.
If there are repetitions, then only one occurrence of element should be printed in union.*/
package ds99.interview.allLevel;

import java.util.*;
import java.lang.*;

class Arrays6 {
    static void printUnion(int[] arr1, int[] arr2) {
        HashSet<Integer> hs = new HashSet<>();

        for (int value : arr1) hs.add(value);
        for (int value : arr2) hs.add(value);
        System.out.println(hs);
    }


    static void printIntersection(int[] arr1, int[] arr2) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs1 = new HashSet<>();

        for (int item : arr1) hs.add(item);

        for (int value : arr2)
            if (hs.contains(value))
                System.out.print(value + " ");
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr1 = {7, 1, 5, 2, 3, 6};
        int[] arr2 = {3, 8, 6, 20, 7};

        // Function call
        System.out.println("Union of two arrays is : ");
        printUnion(arr1, arr2);

        System.out.println(
                "Intersection of two arrays is : ");
        printIntersection(arr1, arr2);
    }
}
