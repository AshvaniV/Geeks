//Rearrange Array Alternately
/*Given a sorted array of positive integers. Your task is to rearrange  the array elements alternatively i.e first
 element should be max value, second should be min value, third should be second max, fourth should be second min and
 so on...*/
package ds01.arrays.level1;

import java.util.ArrayList;

public class Arrays_12 {

    static void rearrangeArray(int[] arr, ArrayList<Integer> al) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            al.add(arr[end]);
            al.add(arr[start]);
            start++;
            end--;
        }
        if (arr.length % 2 != 0)
            al.add(arr[start]);
    }

    public static void main(String[] args) {
        ArrayList<Integer> Al = new ArrayList<>();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        rearrangeArray(arr, Al);

        for (int a : Al) {
            System.out.print(a + " ");
        }
    }
}
