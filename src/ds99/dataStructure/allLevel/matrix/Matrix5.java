package ds99.dataStructure.allLevel.matrix;

import java.util.Arrays;

public class Matrix5 {

    static int[][] sortedMatrix(int n, int[][] matrix) {
        int[] arr = new int[n*n];
        int k =0;
        for(int i = 0; i <n;i++){
            for(int j =0; j< n;j++){
                arr[k++] = matrix[i][j];
            }
        }
        Arrays.sort(arr);

        int l = 0;
        for(int i = 0; i <n;i++){
            for(int j =0; j< n;j++){
                 matrix[i][j] = arr[l];
            }
        }
        return matrix;
    }
    public static void main(String[] args) {

    }
}
