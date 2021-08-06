// **Hard** Minimum swaps and K together
/*Given an array of n positive integers and a number k. Find the minimum number of swaps required to bring all the numbers
 less than or equal to k together.*/

package ds99.dataStructure.allLevel.arrays;

public class Arrays33 {
    private static int minSwaps(int[] arr, int n, int k) {
        //good is length of array having elements less than or equal to K
        int good = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= k)
                good++;
        }

        int minSwap = Integer.MAX_VALUE;
        int bad = 0;

        //in each window, find number of elements need to swap and store them in bad
        for (int i = 0; i < good; i++) {
            if (arr[i] > k)
                bad++;
        }

        //now we have window which have elements less than or equal to k so check all windows 1 by 1 from this window till last
        int i = 0;
        int j = good - 1;        //we need to check all elements in array in window so take j as first element of window
        while (j < n) {
            minSwap = Math.min(bad, minSwap);
            j++;

            //now we will check if our jth element is more than k then we will increase bad. We will also check
            //value of arr[i] is also more than k then we will decrease k.
            if (j < n && arr[j] > k) bad++;
            if (arr[i] > k) bad--;

            //increase i for each jth increment
            i++;
        }

        if (minSwap == Integer.MAX_VALUE) return 0;
        else
            return minSwap;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 3};
        int k = 3;
        int n = arr.length;
        System.out.println(minSwaps(arr, n, k));

    }
}

//solution
/*
We will use sliding window technique where first we need to find total elements which are smaller than or equals to k.
So now we can consider total elements as length of window in given array and we can start traversing array for this
window and find out minimum swap required in all windows to get all elements lesser or equal to K together.
* */
