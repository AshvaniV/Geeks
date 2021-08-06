//Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo
package ds99.dataStructure.allLevel.arrays;

public class Arrays4 {

    private static void sortArrayWithoutAlgo(int[] arr) {
        int zero = 0;
        int one = 0;
        int two = 0;
        for (int a : arr) {
            if (a == 0)
                zero++;
            if (a == 1)
                one++;
            if (a == 2)
                two++;
        }

        for (int i = 0; i < zero; i++) {
            arr[i] = 0;
        }

        for (int j = zero; j < zero + one; j++) {
            arr[j] = 1;
        }

        for (int k = zero + one; k < zero + one + two; k++) {
            arr[k] = 2;
        }
        printArray(arr);
    }


    //Better approach
    public static void sort012(int a[], int n) {
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            switch (a[mid]) {
                case 0: {
                    int temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                    low++;
                    mid++;
                    break;
                }

                case 1: {
                    mid++;
                    break;
                }

                case 2: {
                    int temp = a[high];
                    a[high] = a[mid];
                    a[mid] = temp;
                    high--;
                    break;
                }
            }

        }
    }


    private static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 0, 0, 1, 1, 1, 1, 2, 2, 2, 0, 0, 1, 2, 1, 2, 0, 0, 0, 0, 0};
        printArray(arr);
        sortArrayWithoutAlgo(arr);
    }
}
