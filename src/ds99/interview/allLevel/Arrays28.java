package ds99.interview.allLevel;

import java.util.Arrays;

public class Arrays28 {


    public static int find3Numbers(int[] arr, int n, int sum) {
        Arrays.sort(arr);

        int result = 0;

        for (int i = 0; i < n - 2; i++) {
            int start = i + 1;
            int end = n - 1;


            while (start < end) {
                if ((arr[i] + arr[start] + arr[end]) == sum) {
                    result = 1;
                    break;
                } else if ((arr[i] + arr[start] + arr[end]) > sum) {
                    end--;
                } else {
                    start++;
                }
            }
            if (result == 1)
                break;
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = {305, 497, 163, 538, 552, 852, 733, 566, 939, 446, 229, 195, 527};
        int N = arr.length;
        int X = 1142;
        int output = find3Numbers(arr, N, X);
        System.out.println(output);
    }
}
