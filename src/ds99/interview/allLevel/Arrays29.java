//Trapping rain water

package ds99.interview.allLevel;

public class Arrays29 {

    static void trappingWater2(int[] arr, int n) {
//create 2 arrays L and R, where L will have maximum height from left side and R will have maximum height from right
        int[] L = new int[arr.length];
        int[] R = new int[arr.length];
        int maxFromLeft = 0;
        int maxFromRight = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxFromLeft) {
                maxFromLeft = arr[i];
            }
            L[i] = maxFromLeft;
        }

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
            }
            R[i] = maxFromRight;
        }
        printArray(L);
        printArray(R);

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + (Math.min(L[i], R[i]) - arr[i]);
        }
        System.out.println("sum " + sum);
    }

    private static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 0, 2, 0, 4};
        trappingWater2(arr, arr.length);
    }
}
