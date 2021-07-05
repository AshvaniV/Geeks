//Median of array
//Array should be sorted
//In case of odd no of elements, middle no is median
//In case of even number of elements average of two middle elements is the median

package ds99.dataStructure.allLevel.arrays;

import java.util.Arrays;

public class Arrays35 {
    public static int findMedian(int[] v) {
        Arrays.sort(v);
        int n = v.length;
        int mid;
        if (n % 2 == 0) {
            mid = n / 2;
            return (v[mid] + v[mid - 1]) / 2;
        } else
            mid = n / 2;
        return v[mid];
    }

    public static void main(String[] args) {
        int[] a = {5, 7, 15, 10, 20};
        System.out.println(findMedian(a));

    }
}
