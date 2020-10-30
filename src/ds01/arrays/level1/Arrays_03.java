/*Find max and 2nd max.
If 2nd max is not available then return -1.*/
package ds01.arrays.level1;

public class Arrays_03 {
	private static void largestAndSecondLargest(int sizeOfArray, int a[]) {
		int max = -1;
		int max2 = -1;
		for (int i = 0; i < sizeOfArray; i++) {
			if (a[i] > max) {
				max2 = max;
				max = a[i];
			}
			if (a[i] < max && a[i] > max2) {
				max2 = a[i];
			}
		}
		System.out.println(max + " " + max2);
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 3, 4, 4, 5 };
		largestAndSecondLargest(a.length, a);
	}
}
