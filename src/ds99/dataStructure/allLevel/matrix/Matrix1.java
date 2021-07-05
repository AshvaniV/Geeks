/*Given a matrix of size R*C. Traverse the matrix in spiral form.*/

package ds99.dataStructure.allLevel.matrix;
import java.util.ArrayList;

public class Matrix1 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        spirallyTraverse(3, 4, matrix);
    }

    static void spirallyTraverse(int rows, int columns, int[][] a) {
        int top = 0, bottom = rows - 1, left = 0, right = columns - 1;

        ArrayList<Integer> ar = new ArrayList<>();
        while (left <= right && top <= bottom) {

            for (int i = left; i <= right; i++) {
                ar.add(a[top][i]);
                //System.out.print(a[top][i] + " ");
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                ar.add(a[i][right]);
                //System.out.print(a[i][right] + " ");
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ar.add(a[bottom][i]);
                    //System.out.print(a[bottom][i] + " ");
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ar.add(a[i][left]);
                    //System.out.print(a[i][left] + " ");
                }
                left++;
            }
        }

        System.out.println(ar.toString());
    }
}
