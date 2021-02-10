//Rotate an array clockwise[Left Rotation] and anti-clockwise[Right Rotation] by k place
package ds01.arrays.level1;

public class Arrays_07 {

    private static void rotateClockWise(int[] array, int n, int d) {
        // input: 1,2,3,4,5,6,7 d = 2 output: 3,4,5,6,7,1,2
        reverse(array, 0, d - 1);
        reverse(array, d, n - 1);
        reverse(array, 0, n - 1);
    }

    private static void rotateAntiClockWise(int[] array, int n, int d) {
        // input: 1,2,3,4,5,6,7 d = 2 output: 6,7,1,2,3,4,5
        reverse(array, 0, n - d - 1);
        reverse(array, n - d, n - 1);
        reverse(array, 0, n - 1);
    }

    private static void reverse(int[] array, int start, int end) {
        int temp = 0;
        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        rotateClockWise(array, array.length, 1);
        //rotateAntiClockWise(array, array.length, 1);
        printArray(array);

    }
}
