package ds99.dataStructure.allLevel.matrix;

public class Matrix8 {

    static void rotateBy90UsingLayers(int[][] m, int n) {
        int lastLayer = m.length - 1;

        for (int layer = 0; layer < m.length / 2; layer++) {
            for (int j = layer; j < lastLayer - layer; j++) {
                int leftTop = m[layer][j];
                int rightTop = m[j][lastLayer - layer];
                int leftBottom = m[lastLayer - j][layer];
                int rightBottom = m[lastLayer - layer][lastLayer - j];


                //rotate
                m[layer][j] = leftBottom;
                m[j][lastLayer - layer] = leftTop;
                m[lastLayer - j][layer] = rightBottom;
                m[lastLayer - layer][lastLayer - j] = rightTop;
            }
        }
    }

    // Function for print matrix
    static void printMatrix(int N, int arr[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        rotateBy90UsingLayers(matrix, matrix.length);
        printMatrix(matrix.length, matrix);
    }
}

/**/

