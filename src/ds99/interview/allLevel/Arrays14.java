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

        //step1 sort the intervals using Arrays.sort and comparator
        Arrays.sort(intervals, (x, y) ->
                Integer.compare(x[0], y[0]));

        //create a list of array to return as result

        List<int[]> result = new ArrayList<>();


        //iterate all intervals and compare last value of previous interval with start value of next interval
        //if we find that next interval's start value is greater or equal than last value of previous interval
        //that means there is overlapping so discard the overlapped one. Now we have start of previous and will
        //take end of next interval [as there is overlapping and discarded]

        int[] newInterval = intervals[0];                                //take first interval in newInterval and add it to result as first interval will always be there
        result.add(newInterval);

        for (int[] interval : intervals) {

            //first time both will have first interval but next time interval will have second and newInterval will have 1st
            if (interval[0] <= newInterval[1]) {
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            } else {
                newInterval = interval;
                result.add(newInterval);
            }
        }

        return result.toArray(new int[result.size()][]);

    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};


        int[][] result = merge(arr);
        System.out.println(Arrays.deepToString(result));
    }
}
