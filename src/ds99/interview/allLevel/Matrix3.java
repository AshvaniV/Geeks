//Median in a row-wise sorted Matrix
//Given a row wise sorted matrix of size RxC where R and C are always odd, find the median of the matrix.

package ds99.interview.allLevel;

import java.util.Arrays;

public class Matrix3 {

    static int median(int[][] matrix, int r, int c) {
        int[] a = new int[r * c];
        int n = a.length;
        int k = 0;

        //fill array with matrix elements
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[k++] = matrix[i][j];
            }
        }
        Arrays.sort(a);

        return a[(n - 1) / 2];
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        System.out.println(median(matrix, matrix.length, matrix[0].length));
    }
}
//Solution
/*We have to take an array to and fill it with all matrix elements. Sort the array and find median*/