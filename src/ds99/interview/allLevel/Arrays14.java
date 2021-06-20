/*Merge Intervals
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of
the non-overlapping intervals that cover all the intervals in the input.

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
 */


package ds99.interview.allLevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays14 {

    static int[][] merge(int[][] intervals) {

        //step1 sort the intervals using Arrays.sort and comparator : sort 2D array
        //here x and y will be having 2 intervals and it is comparing first value of these intervals
        Arrays.sort(intervals, (x, y) ->
                Integer.compare(x[0], y[0]));

        System.out.println("2D array after sorted ");
        System.out.println(Arrays.deepToString(intervals));

        //create a list of array to return as result
        List<int[]> result = new ArrayList<>();

        int[] previousInterval = intervals[0];                                //take first interval in previousInterval and add it to result as first interval will always be there
        result.add(previousInterval);

        for (int[] interval : intervals) {

            //first time both will have first interval but next time interval will have next and previousInterval will have previous
            if (previousInterval[1] >= interval[0]) {
                previousInterval[1] = Math.max(previousInterval[1], interval[1]);
            } else {
                previousInterval = interval;
                result.add(previousInterval);
            }
        }

        return result.toArray(new int[result.size()][]);

    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {5, 9}, {3, 4}, {11, 12}, {7, 10}};


        int[][] result = merge(arr);
        System.out.println(Arrays.deepToString(result));
    }
}

/*Logic:
Sort oll intervals
If 2nd element of any interval is greater than 1st element of next interval then they can be merged. second element of
merged interval should be the one which is greater in both elements.
if above condition doesn't satisfy then we add the interval as it in result and assign it to previousInterval
because next time from now we will be comparing with this interval.

TC => O[NlogN]
SC => O[N]
* */


//sorting concept
/* we can sort 2D array using below sort implementation,

public static <T> void sort(T[] a,
            Comparator<? super T> c)

Java7 implementation
        java.util.Arrays.sort(intervals,
                new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });

Java8 implementation
        Arrays.sort(intervals, (x, y) ->
                Integer.compare(x[0], y[0]));
*/


