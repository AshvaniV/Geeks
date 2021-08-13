//Maximum Product Sub-array
package ds99.dataStructure.allLevel.arrays;

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
Logic: We have to find maximum product sub-array so we have to take care of negative numbers as well.
there are 3 parameters, which are holding minimum, maximum and result values. initially we assigned first array value to
all of them,
there might be 3 scenarios, at ith location, we have positive number, negative number or 0.
for positive no: calculate max and min using this.
for negative no: we know that if we multiply our max with this it will become smaller compare to min so we swap min and
max and then calculate max and min as usual.
If anytime we got 0 in ith location, it will make both max and min as 0 so afterwards they will start from next to 0 which
is correct in our case because whenever we have 0 in our array it will make whole product as 0 so there will be sub-array
before or after 0 without involving 0.

*/