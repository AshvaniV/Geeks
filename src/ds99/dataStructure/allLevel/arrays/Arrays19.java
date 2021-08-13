/*
Common elements
Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
*/

package ds99.dataStructure.allLevel.arrays;

import java.util.ArrayList;

public class Arrays19 {
    static ArrayList<Integer> commonElements(int[] A, int[] B, int[] C, int n1, int n2, int n3) {
        ArrayList<Integer> s = new ArrayList<>();
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n1 && j < n2 && k < n3) {

            if (A[i] == B[j] && B[j] == C[k]) {
                if (!s.contains(A[i]))
                    s.add(A[i]);
            }
            if (A[i] < B[j])
                i++;
            else if (B[j] < C[k])
                j++;
            //above cases are A<B<C that means C is greater than A and B
            //Below else case mean C is smaller than A and B so we can increase k
            else
                k++;
        }
        return s;
    }

    public static void main(String[] args) {
        int[] A = {1, 5, 10, 20, 40, 80};
        int[] B = {6, 7, 20, 80, 100};
        int[] C = {3, 4, 15, 20, 30, 70, 80, 120};

        ArrayList<Integer> AL = commonElements(A, B, C, A.length, B.length, C.length);
        for (int a : AL) {
            System.out.print(a + " ");
        }
    }
}

/*
Solution :
sol 1: we can find intersection of A and B and the this result's intersection with C. [this result is applicable
for non sorted arrays as well]
sol 2: as we know all arrays are sorted so we can run a loop till any smallest length array and then
find elements available in all 3 arrays.

Space complexity : O(n1+n2+n3)
Time complexity :  O(n1+n2+n3)
*/
