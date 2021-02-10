//Merge 2 sorted arrays without using Extra space
package ds99.interview.allLevel;

import java.util.Arrays;

public class Arrays12 {

    static void mergeWithoutExtraSpace(int[] arr1, int[] arr2) {
        //start from last index on arr1 and first index for arr2
        int lastIndexOfArr1 = arr1.length - 1;
        int firstIndexOfArr2 = 0;
        /*We knows both the arrays are sorted that means if we want to first sort them in such a way that n elements should go
         * for arr1 and rest m elements should go for arr2, we have to run loop which should start last index of arr1 and
         * first index of arr2. This loop will look for such elements in arr2 in start which are less than last elements in arr1
         * if we find any then swap them. Now pointer from arr1 will go to previous index and pointer from arr2 will go for next
         * index.
         * We know that this loop is having && condition so it will run only till the minimum number of elements in any array.
         * This is completely fine because We know both arrays were sorted since start so once we swap or make changes for number
         * of elements of small array, the other once will have rest elements in right place.*/
        while (lastIndexOfArr1 >= 0 && firstIndexOfArr2 < arr2.length) {
            if (arr1[lastIndexOfArr1] > arr2[firstIndexOfArr2]) {
                int temp = arr1[lastIndexOfArr1];
                arr1[lastIndexOfArr1] = arr2[firstIndexOfArr2];
                arr2[firstIndexOfArr2] = temp;
                lastIndexOfArr1--;
                firstIndexOfArr2++;
            } else
                break;

        }

        //Now arr1 has all element lower than any element of arr2 so now sort them individually and print them
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int t : arr1) {
            System.out.print(t + " ");
        }
        System.out.println("*");
        for (int t : arr2) {
            System.out.print(t + " ");
        }
        System.out.println("*");

        StringBuilder sb = new StringBuilder();
        for (int value : arr1) {
            sb.append(value).append(" ");
        }

        for (int value : arr2) {
            sb.append(value).append(" ");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 7};
        int[] arr2 = {2, 2, 6, 6, 7, 7, 10, 11, 12, 14, 15, 16};
        mergeWithoutExtraSpace(arr1, arr2);

    }
}
