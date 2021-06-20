//Array Subset of another array
/*Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m. Task is to check whether a2[] is a subset of
a1[] or not. Both the arrays can be sorted or unsorted. It may be assumed that elements in both array are distinct.*/

package ds99.interview.allLevel;
import java.util.HashSet;

public class Arrays27 {
    private static void findSubset(int[] arr1, int[] arr2, int size1, int size2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < size1; i++) {
            set.add(arr1[i]);
        }
        boolean flag = true;
        for (int i = 0; i < size2; i++) {
            if (!set.contains(arr2[i])) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5, 3, 4, 7, 8, 8, 9, 10};
        int[] arr2 = {3, 2, 7, 5, 6};
        int size1 = arr1.length;
        int size2 = arr2.length;
        findSubset(arr1, arr2, size1, size2);
    }
}
/*Solution:
As we know Set has unique elements and so we ca push all elements in a HashSet and then check all Array2 elements
are present in HashSet or not. if present that means given array is subset of another array.
* */