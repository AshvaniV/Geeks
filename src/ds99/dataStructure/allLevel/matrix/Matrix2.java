/*Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.*/

package ds99.dataStructure.allLevel.matrix;

public class Matrix2 {
    public static boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        //when we have all matrix elements sorted from left to right in all rows. Pointer is at first row and last column
        int i = 0, j = columns - 1;

        //traverse i form left to right and j from right to left
        while (i < rows && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target)
                j--;
            else
                i++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        System.out.println(searchMatrix(matrix, 100));
    }
}
//solution:
/* This is an optimized solution which have time complexity
for O[n*n] approach is O[n]
for O[m*n] approach is O[m+n]



Here in given example we are starting from top right corner of matrix ie matrix[0][column-1]
ie last element of first row.
If we match this as target then return true.
If this element is greater than target then reduce column by 1 and if current is smaller than target then increase row by 1.
traverse for all elements and if we don't find it return false.
 */