//Find the maximum and minimum element in an array
package ds99.dataStructure.allLevel.arrays;

public class Arrays2 {

    private static void findMaxAndMin(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int a : arr) {
            if (a > max)
                max = a;
            if (a < min)
                min = a;
        }
        System.out.println("min value is " + min + " and max value is " + max);
    }


    private static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -100, -1, 10000};
        printArray(arr);
        findMaxAndMin(arr);

    }
}
