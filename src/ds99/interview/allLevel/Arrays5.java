//Move all the negative elements to one side of the array
//No need to maintain order of elements
package ds99.interview.allLevel;

public class Arrays5 {

    private static void reArrange(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                //swap a with a[j]
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
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
        int[] arr = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        printArray(arr);
        reArrange(arr);
        printArray(arr);
    }
}

/*Solution:
 * take a variable j as 0 and loop array using variable i,whenever we find any negative element,swap a[i] with a[j] and increase j.
 * What will happen, j is responsible to place all negative elements at start so whenever we find any negative element swap it
 * with the element at jth location and increase j for next negative element. Positive elements will not change it's position so they will
 * automatically move after negative elements
 * */