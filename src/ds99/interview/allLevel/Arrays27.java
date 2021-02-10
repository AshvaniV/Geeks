//Array Subset of another array
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
