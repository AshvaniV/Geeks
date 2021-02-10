//find duplicate in an array of N+1 Integers
package ds99.interview.allLevel;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Arrays11 {

//time and space complexity : O[n]
    static void findDuplicate1(int[] arr, int d) {
        int[] freq = new int[d];
        for (int i = 0; i < d; i++) {
            freq[arr[i]]++;
    //for single duplicate number
            /*if (freq[arr[i]] > 1) {
                System.out.println("duplicate number in array is " + arr[i]);
                break;
            }*/
        }

    //for multiple duplicate numbers
        System.out.println("Duplicate numbers in array are ");
        for (int i = 0; i < d; i++) {
            if (freq[i] > 1) {
                System.out.print(i + " ");
            }
        }
    }

//Solution for space complexity O[1]
    static void findDuplicate2(int[] arr, int d) {
        //logic: treat given array as frequency array. Iterate each of the element and add array's length for any finding,
        // so at last we will have length+element+1 for each non-duplicate element and for duplicate elements we will have value more than length+element +1.

        for (int i = 0; i < d; i++) {
            arr[i] = arr[i]+d;
        }


        for(int i =0; i < d;i++) {
            if(arr[i]%d > 2){
                System.out.print(arr[i]+" ");
            }
        }

    }


    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2, 5, 6, 7, 8, 9, 2, 10, 1, 10, 3};
        int d = arr.length;
        findDuplicate2(arr, d);

    }
}
