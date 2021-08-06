//Chocolate Distribution Problem
/*Given an array of n integers where each value represents the number of chocolates in a packet. Each packet can have a variable number
of chocolates. There are m students, the task is to distribute chocolate packets such that:

Each student gets one packet.
The difference between the number of chocolates in the packet with maximum chocolates and packet with minimum chocolates given to the
students is minimum.
there are more chocolate packets and less students so we can choose which packet we can give to students the condition is
we have to give only 1 packet per student and no of chocolates given to student has minimum difference. It is not necessary
that students will always get a packet with minimum chocolates.
In {3, 4, 1, 9, 56, 7, 9, 12} and students = 5, so we will give {3,4,7,9,9}, we are not giving 1 to anyone so that their
max and min difference will be small.
Expected Time Complexity: O(N*Log(N))
Expected Auxiliary Space: O(1)
*/
package ds99.dataStructure.allLevel.arrays;

import java.util.Arrays;

public class Arrays30 {
    private static int chocoDist(int[] arr, int students, int n) {
        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n - students + 1; i++) {       //for an array of size 10 and student 5 this will go till
                                                        // 5th index means 6th array value so below condition will check till last element
            int difference = arr[i + students - 1] - arr[i];
            if (min > difference)
                min = difference;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 100, 101, 102, 103, 104};
        int size = arr.length;
        int m = 5;
        System.out.println(chocoDist(arr, m, size));
    }
}

//solution
/*
We are not worried about how less chocolate a student gets, we are worried about the difference between min and chocolates
that students will get. So once we sorted the array, we can take m students out of n chocolates that means from array
we can check m students interval each time and find their max and min element different. Next time find another m student's
min and max difference so at last we will have minimum difference of chocolates that m students are getting.

time complexity : O[nlogn] from sorting
* */
