/*
Next Permutation
Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
If such an arrangement is not possible, it must rearrange it as the lowest possible order (i.e., sorted in ascending order).
The replacement must be in place and use only constant extra memory.


* */


package ds99.interview.allLevel;

public class Arrays15 {
    static void reverse(int[] a, int i, int j) {
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }

    public static void nextPermutation(int[] arr) {
        int idx = -1;
        int n = arr.length;

        for (int i = n - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                idx = i;              //finding element from right side which is greater than it's left element
                break;
            }
        }

        if (idx == -1) {
            reverse(arr, 0, arr.length - 1);
        } else {
            //now we have index of number which is greater than it's left value, store this in prev and find element
            // which is immediate next to a[idx-1] and smaller or equal than a[prev]

            int prev = idx;
            for (int i = idx + 1; i < n; i++) {
                if (arr[i] > arr[idx - 1] && arr[i] <= arr[prev]) {
                    prev = i;
                }
            }
            int tmp = arr[idx - 1];
            arr[idx - 1] = arr[prev];
            arr[prev] = tmp;


            reverse(arr, idx, arr.length - 1);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 8, 4, 7, 6, 5, 3, 1};
        nextPermutation(a);


        for (int b : a) {
            System.out.print(b + " ");
        }

    }
}
/*
 * TC:: O(n)
 * SC:: O(1)
 *
 * */