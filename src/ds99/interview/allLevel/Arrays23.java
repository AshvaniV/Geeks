//Maximum Product Subarray
package ds99.interview.allLevel;

public class Arrays23 {
    static long productSubArray1(int[] arr) {
        if (arr.length == 0) return 0;

        long max = arr[0];
        long min = arr[0];
        long result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0) {
                //swap max and min
                long temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(arr[i], max * arr[i]);
            min = Math.min(arr[i], min * arr[i]);
            if (max > result)
                result = max;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 12, 15, 23, 33, -35, 30, -40, -30, -30, -30, 26, 28};
        System.out.println(productSubArray1(arr));
    }
}


/*
Logic: We have to find maximum product subarray so we have to take care of negative numbers as well.
Whenever we have negative number at ith location we swap previous max and min [because while a negative
number multiplied by a small number it becomes a big number so we have big number on max but now after swap
max will hold a small number and min will hold a big number]
We will find min between previous min and min*arr[i] and we find max between previous max and max* arr[i]
at last we compare max with result and if max > result then update result.
*/