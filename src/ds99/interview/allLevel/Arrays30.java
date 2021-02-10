//Chocolate Distribution Problem
/*Given an array of n integers where each value represents the number of chocolates in a packet. Each packet can have a variable number
of chocolates. There are m students, the task is to distribute chocolate packets such that:

Each student gets one packet.
The difference between the number of chocolates in the packet with maximum chocolates and packet with minimum chocolates given to the
students is minimum.*/
package ds99.interview.allLevel;
import java.util.Arrays;

public class Arrays30 {
    private static int chocoDist(int[] arr, int students, int n) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i + students - 1 < n; i++) {
            int difference = arr[i + students - 1] - arr[i];
            if (min > difference)
                min = difference;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
        int size = arr.length;
        int m = 5;
        System.out.println(chocoDist(arr, m, size));
    }
}

//solution
/*
Each time consider we check all students in array of chocolate packets and their minimum and maximum chocolate difference.
time complexity : O[nlogn] from sorting
* */
