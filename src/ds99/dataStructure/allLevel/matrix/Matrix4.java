//Given a boolean 2D array of n x m dimensions where each row is sorted. Find the 0-based index of the first row that has the maximum number of 1's.

package ds99.dataStructure.allLevel.matrix;

public class Matrix4 {
    static int rowWithMax1s(int[][] matrix, int rows, int columns) {
        int i = 0;
        int j = columns - 1;
        int maxRowElements = -1;

        while (i < rows && j >= 0) {

            if (matrix[i][j] == 1) {
                maxRowElements = i;
                j--;
            } else
                i++;
        }
        return maxRowElements;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {0, 0, 0, 1},
                {1, 1, 1, 1},
                {0, 0, 1, 1},
                {0, 1, 1,}
        };
        System.out.println(rowWithMax1s(matrix, matrix.length, matrix[0].length));
    }
}


//Solution
/*We have given that matrix is binary and sorted so we have a clue here that if we have any 1 from left to right to rest
of the right elements will also be 1. So we will start from right more corner of 1st row and then travel towards left side

Here whenever we find 1 we are going left that means we can have more 1s in left to travel till we find .
Whenever we have 0s, go down and check for 0s and 1s in next row in same way.

This is similar approach which we use to search an element in a sorted matrix.
*/