//Three way partitioning of an array around a given value
/*Given an array of size N and a range [a, b]. The task is to partition the array around the range such that array is divided into three parts.
1) All elements smaller than a come first.
2) All elements in range a to b come next.
3) All elements greater than b appear in the end.
The individual elements of three sets can appear in any order. You are required to return the modified array.*/

package ds99.interview.allLevel;

public class Arrays32 {

    public static void threeWayPartition(int arr[], int a, int b)
    {
        int l = 0;
        int r = arr.length - 1;

        for (int i = 0; i <= r; i++) {
            if (arr[i] < a) {
                int tmp = arr[i];
                arr[i] = arr[l];
                arr[l] = tmp;
                l++;
            } else if (arr[i] > b) {
                int tmp = arr[i];
                arr[i] = arr[r];
                arr[r] = tmp;
                r--;
                i--;
            }
        }
printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println("\n");
    }


    public static void threeWayPartition1(int[] arr, int lowVal, int highVal) {
        int n = arr.length;
        int start = moveSmallerToLeft(arr, lowVal, n, 0);
        int end = moveLargerToRight(arr, highVal, n, n - 1);
        moveSmallerToLeft(arr, lowVal + 1, n, start);
        moveLargerToRight(arr, highVal - 1, n, end);
        printArray(arr);
    }

    private static int moveLargerToRight(int[] arr, int highVal, int n, int end) {
        for (int i = end; i >= 0; i--) {
            if (arr[i] > highVal) {
                swap(arr, end, i);
                end--;
            }
        }
        return end;
    }

    private static int moveSmallerToLeft(int[] arr, int lowVal, int n, int start) {
        for (int i = start; i < n; i++) {
            if (arr[i] < lowVal) {
                swap(arr, start, i);
                start++;
            }
        }
        return start;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {15, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
        int a = 14;
        int b = 20;
        threeWayPartition1(arr, a, b);
    }

}
