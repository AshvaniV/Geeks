//rotate matrix by 90' clockwise
package ds99.dataStructure.allLevel.matrix;

public class Matrix9 {
    static int[][] transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }

    static int[][] reverse(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
        return matrix;
    }

    // Function for print matrix
    static void printMatrix(int[][] arr, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        System.out.println("input");
        printMatrix(matrix, matrix.length);
        System.out.println("after transpose");
        int[][] mat = transpose(matrix);

        printMatrix(mat, mat.length);

        int[][] out = reverse(mat);
        System.out.println("reverse after transpose will give result for 90' right rotate");
        printMatrix(out, out.length);

    }
}
